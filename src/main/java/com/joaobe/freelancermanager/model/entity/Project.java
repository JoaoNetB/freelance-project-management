package com.joaobe.freelancermanager.model.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    @NotBlank
    private String name;

    @Column(length = 250)
    @NotBlank
    private String description;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data_initial;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data_final;

    @Column(nullable = false, length = 100)
    @NotBlank
    private String client;

    @Min(0)
    private float value;

    public Project() {

    }

    public Project(String name, String description, String data_initial, String data_final, String client, float value)
            throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data_i_format = format.parse(data_initial);
        Date data_f_format = format.parse(data_final);

        this.name = name;
        this.description = description;
        this.data_initial = data_i_format;
        this.data_final = data_f_format;
        this.client = client;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getData_initial() {
        return data_initial;
    }

    public void setData_initial(Date data_initial) {
        this.data_initial = data_initial;
    }

    public Date getData_final() {
        return data_final;
    }

    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
