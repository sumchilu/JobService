package com.rnd.sb.jobservice.service;

import com.rnd.sb.jobservice.model.Job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface JobService {
    public List<Job> getAll();
    public void addJob(Job job);

}
