package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.bean.EmployerBean;
import com.example.demo.repository.EmployerRepository;

public class EmploymentServiceImpl {
	
	@Autowired
    private EmployerRepository employerRepository;
	
	public List<EmployerBean> getEmployer(){
        return employerRepository.selectAll();
	}

}
