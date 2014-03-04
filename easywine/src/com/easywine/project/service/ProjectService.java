package com.easywine.project.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.easywine.project.dao.ProjectDao;

@Service("ProjectService")
public class ProjectService {

	@Resource(name="ProjectDao")
	private ProjectDao projectDao;
	
}
