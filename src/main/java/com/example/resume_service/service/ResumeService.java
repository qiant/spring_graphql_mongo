package com.example.resume_service.service;

import java.util.List;

import com.example.resume_service.model.Resume;
import com.example.resume_service.repository.ResumeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ResumeService {
    @Autowired
    ResumeRepository resumeRepository;

    @Autowired
    SequenceGeneratorService sequenceGenerator;

    public Resume uploadResume(Resume resume) {
        resume.setId(sequenceGenerator.generateSequence(Resume.SEQUENCE_NAME));
        Resume res = resumeRepository.save(resume);
        log.info("uploaded resume for {} id {} Id before save upload: {}", resume.getName(), res.getId(), resume.getId());
        return res;
    }

    public List<Resume> getResumeById(Integer id){
        return resumeRepository.findById(id);
    }
    public List<Resume> getResumeByName(String name) {
        return resumeRepository.findByName(name);
    }
}
