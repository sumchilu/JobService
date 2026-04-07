package com.rnd.sb.jobservice.model;

import lombok.Data;

@Data
public class Job {

    private int id;
    private String name;
    private String description;
    private String status;
    private String startTime;
    private String endTime;

}
