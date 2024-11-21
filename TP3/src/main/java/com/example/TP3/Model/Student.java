package com.example.TP3.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Table
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "std_id")
    private Long id;
    @Column(name = "name")
    private String name ;
    @Column(name = "email")
    private String email;
    @Column(name = "dob")
    private LocalDate dob;
    @Column(name = "grade")
    private Integer grade;

    public Student() {
    }

    public Student(Long id, String name, String email, LocalDate dob, Integer grade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.grade = grade;
    }

    public Student(String name, String email, LocalDate dob, Integer grade) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
