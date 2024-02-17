package com.example.jobmsa.job.mapper;

import com.example.jobmsa.job.Job;
import com.example.jobmsa.job.dto.JobDTO;
import com.example.jobmsa.job.external.Company;
import com.example.jobmsa.job.external.Review;

import java.util.List;

public class JobMapper {
    public static JobDTO mapToJobWithCompanyDto(Job job, Company company, List<Review> review){
        JobDTO jobDTO = new JobDTO();
        jobDTO.setId(job.getId());
        jobDTO.setCompany(company);
        jobDTO.setTitle(job.getTitle());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setLocation(job.getLocation());
        jobDTO.setMaxSalary(job.getMaxSalary());
        jobDTO.setMinSalary(job.getMinSalary());
        jobDTO.setReview(job.getReview());

        return jobDTO;
    }

}
