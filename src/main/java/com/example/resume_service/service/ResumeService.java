package com.example.resume_service.service;

import java.util.List;

import com.example.resume_service.model.Resume;
import com.example.resume_service.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {
    @Autowired
    ResumeRepository resumeRepository;
    public Integer uploadResume(Resume resume) {
        Resume res = resumeRepository.save(resume);
        return res.getId();
    }

    public List<Resume> getResumeById(Integer id){
        return resumeRepository.findById(id);
    }
    public List<Resume> getResumeByName(String name) {
        return resumeRepository.findByName(name);
    }
}
