package com.rnd.sb.jobservice.company.service;

import com.rnd.sb.jobservice.company.model.Company;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CompanyService {
    List<Company> getAll();
    Company getCompanyById(Long id);
    void addCompany(Company company);
    boolean deleteCompanyById(Long id);
    boolean updateCompanyById(Long id, Company company);
}
