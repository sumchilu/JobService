package com.rnd.sb.jobservice.controller;


import com.rnd.sb.jobservice.model.Job;
import com.rnd.sb.jobservice.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/")
    public List<Job> getJobs(){
        return jobService.getAll();
    }

    @PostMapping("/")
    public void setJobs(@RequestBody Job job){
        jobService.addJob(job);
    }

}
