package com.joaobe.freelancermanager.model.repository;

import com.joaobe.freelancermanager.model.entity.Project;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProjectRepository extends PagingAndSortingRepository<Project, Integer> {
}
