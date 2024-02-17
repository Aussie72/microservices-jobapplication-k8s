package com.example.companyms.company;

import com.example.companyms.company.dto.ReviewMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {
    List<Company> findAll();

    Company getCompanyById(Long id);

    boolean deleteCompanyById(Long id);

    boolean updateCompanyById(Long id, Company updatedCompany);

    String createCompany(Company company);

    void updateCompanyRating(ReviewMessage reviewMessage);
}
