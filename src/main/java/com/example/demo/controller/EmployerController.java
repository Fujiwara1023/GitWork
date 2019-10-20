package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.EmployerBean;
import com.example.demo.service.EmploymentService;


@Controller
public class EmployerController {
	
	@Autowired
	private EmploymentService employmentService;

	@RequestMapping(value="employer")
	public String init(Model model) {
		
		List<EmployerBean> list = employmentService.getEmployer() ;
		model.addAttribute("list",list);
		
		return "employer";
		}

}
