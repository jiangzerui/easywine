package com.fesco.cs.accumulation.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fesco.cs.accumulation.dao.AccumulationDao;
import com.fesco.cs.accumulation.pojo.AccumulationBase;

@Service("accumulationService")
public class AccumulationService {

	@Resource(name="accumulationDao")
	private AccumulationDao ad;
	
	public AccumulationBase getAccumulationInfo(String onlyNum){
		return ad.getAccumulationInfo(onlyNum);
	}
}
