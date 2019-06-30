package com.neuedu.service;

import com.neuedu.pojo.Job;

import java.util.List;

public interface JobService {
    List<Job> getJobs(Job job);
    List<Job> getAll(Job job);
    Job getJobById(int id);
    int add(Job job);
    int del(Job job);
    int update(Job job);
}
