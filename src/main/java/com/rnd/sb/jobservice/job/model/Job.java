package com.rnd.sb.jobservice.job.model;

import com.rnd.sb.jobservice.company.model.Company;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Table(name = "job_table")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String status;
    private String startTime;
    private String endTime;

    @ManyToOne
    private Company company;

}
