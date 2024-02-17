package com.example.jobmsa.job;

import com.example.jobmsa.job.dto.JobDTO;

import java.util.List;

public interface JobService {
    List<JobDTO> findAll();
    JobDTO convertToDto(Job job);
    String createJob(Job job);

    JobDTO getJobById(Long id);
    boolean deleteJobById(Long id);
    boolean updateJobById(Long id, Job updatedJob);
}
