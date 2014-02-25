package com.fesco.cs.employee.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fesco.cs.employee.dao.EmployeeDao;
import com.fesco.cs.employee.pojo.EmployeeBase;

@Service("employeeService")
public class EmployeeService {
	
	@Resource(name="employeeDao")
	private EmployeeDao empDao;
	
	public EmployeeBase getEmployeeBaseInfoByOnlyNum(String onlyNum){
		return empDao.getEmployeeBaseInfo(onlyNum);
	}

}
