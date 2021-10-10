package com.joaobe.freelancermanager.controller;

import com.joaobe.freelancermanager.model.entity.Project;
import com.joaobe.freelancermanager.model.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectRepository projectR;

    @GetMapping
    public Iterable<Project> getProjects() {

       return projectR.findAll();
    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Project createAndUpdateProject(@Valid Project project) {

        projectR.save(project);
        return project;
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable int id) {

        projectR.deleteById(id);
    }
}
