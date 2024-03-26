package com.example.resume_service.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
@Data
@Document(collection = "resume")
@NoArgsConstructor
@AllArgsConstructor
public class Resume {

    @Transient
    public static final String SEQUENCE_NAME = "resume_sequence";

    @Id
    private Integer id;

    private String name;
    private String firstName;
    private String lastName;
    private String title;    // current job title
    private String jobDescription; // current job description
    private String company; //current job company

    @Override
    public String toString() {
        return "Resume [id=" + id + ", name=" + name + ", company=" + company + "]";
    }

}
