package com.tap.model;

public class Employee {
    private String name;
    private String email;
    private String contact;
    private String course;
    private String comments;

    public Employee() {}

    public Employee(String name, String email, String contact, String course, String comments) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.course = course;
        this.comments = comments;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
}
