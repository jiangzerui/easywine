//package com.easywine.common.controller;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.easywine.project.pojo.Project;
//import com.easywine.project.service.ProjectService;
//
//@Controller
//@RequestMapping("")
//public class HomeController {
//	
//	@Resource(name="ProjectService")
//	private ProjectService projectService;
//
//	@RequestMapping("")
//	public String portalPage( Model model ){
//		List<Project> list = projectService.findProjectMenuList();
//		model.addAttribute("pros", list);
//		return "frontviews/easywine/portal";
//	}
//	
//	@RequestMapping("aboutus")
//	public String aboutusPage( Model model ){
//		List<Project> list = projectService.findProjectMenuList();
//		model.addAttribute("pros", list);
//		return "frontviews/easywine/about";
//	}
//
//}