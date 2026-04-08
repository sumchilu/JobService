package com.rnd.sb.jobservice.company.service.impl;

import com.rnd.sb.jobservice.company.model.Company;
import com.rnd.sb.jobservice.company.repository.CompanyRepository;
import com.rnd.sb.jobservice.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public void addCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public boolean deleteCompanyById(Long id) {
        try {
            companyRepository.deleteById(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean updateCompanyById(Long id, Company company) {

        Optional<Company> byId = companyRepository.findById(id);
        if (byId.isPresent()) {
            var companyToUpdate = byId.get();
            companyToUpdate.setName(company.getName());
            companyToUpdate.setAddress(company.getAddress());
            companyToUpdate.setEmail(company.getEmail());
            companyToUpdate.setPhone(company.getPhone());
            companyToUpdate.setWebsite(company.getWebsite());
            companyToUpdate.setAddress(company.getAddress());
            companyRepository.save(companyToUpdate);
            return true;
        }
        return false;
    }
}
