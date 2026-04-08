package com.rnd.sb.jobservice.company.repository;

import com.rnd.sb.jobservice.company.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
