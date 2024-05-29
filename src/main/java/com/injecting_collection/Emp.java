package com.injecting_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> mobile;
    private Set<String> addresses;
    private Map<String, String> courses;

//    Getters
    public String getName() {
        return name;
    }

    public List<String> getMobile() {
        return mobile;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

//    Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(List<String> mobile) {
        this.mobile = mobile;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

//    Constructor
    public Emp(String name, List<String> mobile, Set<String> addresses, Map<String, String> courses) {
        this.name = name;
        this.mobile = mobile;
        this.addresses = addresses;
        this.courses = courses;
    }

//    Default Constructor

    public Emp() {
    }
}
