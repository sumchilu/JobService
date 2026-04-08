package com.rnd.sb.jobservice.review.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rnd.sb.jobservice.company.model.Company;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double rating;

    @JsonIgnore
    @ManyToOne
    private Company company;
}
