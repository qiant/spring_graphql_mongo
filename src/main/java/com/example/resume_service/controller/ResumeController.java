package com.example.resume_service.controller;

import java.util.List;

import com.example.resume_service.model.Resume;
import com.example.resume_service.service.ResumeService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@Slf4j
public class ResumeController {

    @Autowired
    private ResumeService service;


    @MutationMapping
    public Resume uploadResume(@Argument Integer id, @Argument String name, @Argument String firstName, @Argument String lastName,
                             @Argument String title, @Argument String jobDescription, @Argument String company) {
        try {
            return service.uploadResume(new Resume(id, name, firstName, lastName, title, jobDescription, company));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @QueryMapping
    public Resume resumeById(@Argument Integer id) {
        log.info("query for id: {}", id);
        return service.getResumeById(id).get(0);
    }

    @QueryMapping
    public List<Resume> resumeByName(@Argument String name) {
        log.info("query resume with name : {}", name);
        return service.getResumeByName(name);
    }
}
