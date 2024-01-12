package com.example.resume_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
@Data
@Document(collection = "resume")
public class Resume {
    @Id
    private Integer id;
    private String name;
    private String firstName;
    private String lastName;
    private String title;    // current job title
    private String jobDescription; // current job description
    private String company; //current job company

    public Resume() {
    }

    public Resume(Integer id, String name, String firstName, String lastName, String title, String jobDescription, String company) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.jobDescription = jobDescription;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Resume [id=" + id + ", name=" + name + ", company=" + company + "]";
    }

}
