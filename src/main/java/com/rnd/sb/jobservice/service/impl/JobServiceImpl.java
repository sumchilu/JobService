package com.rnd.sb.jobservice.service.impl;

import com.rnd.sb.jobservice.model.Job;
import com.rnd.sb.jobservice.service.JobService;

import java.util.ArrayList;
import java.util.List;

public class JobServiceImpl implements JobService {
    private List<Job> jobs = new ArrayList<>();
    @Override
    public List<Job> getAll() {
        return jobs;
    }

    @Override
    public void addJob(Job job) {
        jobs.add(job);
    }
}
