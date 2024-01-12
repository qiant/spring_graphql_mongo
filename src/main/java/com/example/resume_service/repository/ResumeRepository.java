package com.example.resume_service.repository;

import java.util.List;

import com.example.resume_service.model.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface ResumeRepository extends MongoRepository<Resume, String> {

    List<Resume> findById(Integer id);

    List<Resume> findByName(String name);

    List<Resume> findByFirstName(String firstName);
    List<Resume> findByLastName(String lastName);
}
