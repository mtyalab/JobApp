package com.krista.jobapp.service;

import com.krista.jobapp.model.JobPost;
import com.krista.jobapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepo repo;

    @Autowired
    public JobService(JobRepo repo) {
        this.repo = repo;
    }

    public void addJob(JobPost jobPost) {
       repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {
       return repo.getAllJobs();
    }
}
