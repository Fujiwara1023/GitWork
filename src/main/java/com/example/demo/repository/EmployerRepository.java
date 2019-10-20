package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.EmployerBean;
	
@Mapper
public interface EmployerRepository {
	public List<EmployerBean> selectAll();
	
}
