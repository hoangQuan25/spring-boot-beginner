package com.hoangquan.springboot.thymeleafdemo.model;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String fvLanguage;
    private List<String> fvOS;

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFvLanguage() {
        return fvLanguage;
    }

    public void setFvLanguage(String fvLanguage) {
        this.fvLanguage = fvLanguage;
    }

    public List<String> getFvOS() {
        return fvOS;
    }

    public void setFvOS(List<String> fvOS) {
        this.fvOS = fvOS;
    }
}
