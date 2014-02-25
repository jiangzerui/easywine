package com.fesco.cs.medical.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fesco.cs.medical.dao.MedicalInsuranceDao;
import com.fesco.cs.medical.pojo.MedicalInsurance;

@Service("mService")
public class MedicalInsuranceService {

	@Resource(name="mDao")
	private MedicalInsuranceDao mDao;
	
	public List<MedicalInsurance> getMedicalInsuranceRecord(String onlyNum){
		return mDao.getMedicalInsuranceRecord(onlyNum);
	}
}
