package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bean.EmployerBean;


@Service
public interface EmploymentService {
	public List<EmployerBean> getEmployer();

}
