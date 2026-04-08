package com.rnd.sb.jobservice.job.service;

import com.rnd.sb.jobservice.job.model.Job;

import java.util.List;

public interface JobService {
    List<Job> getAll();
    void addJob(Job job);

    Job getJobById(Long id);

    boolean deleteJob(Long id);

    boolean updateJob(Long id, Job job);
}
