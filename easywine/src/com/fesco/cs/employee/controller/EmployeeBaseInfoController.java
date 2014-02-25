package com.fesco.cs.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fesco.cs.employee.pojo.EmployeeBase;
import com.fesco.cs.employee.service.EmployeeService;

@Controller
public class EmployeeBaseInfoController {
	@Autowired
	private EmployeeService es;
	
	@RequestMapping("/empInfoBase")
	public String getEmpBaseInfo(String onlyNum,Model model){
		EmployeeBase eb = es.getEmployeeBaseInfoByOnlyNum(onlyNum);
		model.addAttribute("employee", eb);
		return "frontviews/empInfo";
	}
}
