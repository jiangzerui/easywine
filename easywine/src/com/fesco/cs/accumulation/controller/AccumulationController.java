package com.fesco.cs.accumulation.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fesco.cs.accumulation.pojo.AccumulationBase;
import com.fesco.cs.accumulation.service.AccumulationService;

@Controller
public class AccumulationController {
	
	@Resource(name="accumulationService")
	private AccumulationService as;

	@RequestMapping("/accumulationInfo")
	public String getAccumulationInfo(String onlyNum, Model model){
		AccumulationBase ab = as.getAccumulationInfo(onlyNum);
		model.addAttribute("accumulation", ab);
		return "frontviews/accumulation";
	}
}
