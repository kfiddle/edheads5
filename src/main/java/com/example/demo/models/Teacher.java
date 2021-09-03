package com.example.demo.models;


import com.example.demo.models.enums.GradeRange;

import javax.persistence.Entity;

@Entity
public class Teacher extends User {

    private String description;
    private String schoolOrganization;
    private String district;
    private String city;

    private GradeRange gradeRange;

    public Teacher() {
    }

}
