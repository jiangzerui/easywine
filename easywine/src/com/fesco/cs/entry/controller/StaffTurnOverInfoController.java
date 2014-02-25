package com.fesco.cs.entry.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fesco.cs.entry.pojo.EntryInfo;
import com.fesco.cs.entry.service.TurnoverService;

@Controller
public class StaffTurnOverInfoController {

	@Resource(name="turnoverService")
	private TurnoverService ts;
	
	@RequestMapping("/entryInfo")
	public String getEntryInfo(String onlyNum, Model model){
		List<EntryInfo> eis = ts.getEmployeeEntryInfo(onlyNum);
		model.addAttribute("entry",eis);
		return "frontviews/fesco/entryinfo";
	}
	
	@RequestMapping("/dismissionInfo")
	public String getDismissionInfo(String onlyNum, Model model){
		List<EntryInfo> eis = ts.getEmployeeDismissionInfo(onlyNum);
		model.addAttribute("dismiss", eis);
		return "frontviews/fesco/staffTurnover";
	}
}
