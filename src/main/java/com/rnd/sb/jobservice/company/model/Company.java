package com.rnd.sb.jobservice.company.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rnd.sb.jobservice.job.model.Job;
import com.rnd.sb.jobservice.review.model.Review;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String website;


    @JsonIgnore //To Remove Recursion callback.
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Review> reviews;
}
