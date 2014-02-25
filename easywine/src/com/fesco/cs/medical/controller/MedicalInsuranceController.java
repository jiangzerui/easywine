package com.fesco.cs.medical.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fesco.cs.medical.pojo.MedicalInsurance;
import com.fesco.cs.medical.service.MedicalInsuranceService;

@Controller
public class MedicalInsuranceController {

	@Resource(name="mService")
	private MedicalInsuranceService ms;
	
	@RequestMapping("/medicalRecord")
	public String getMedicalInsuranceRecord(String onlyNum, Model model){
		List<MedicalInsurance> mis = ms.getMedicalInsuranceRecord(onlyNum);
		model.addAttribute("mis", mis);
		return "frontviews/fesco/medicalInsurance";
	}
}
