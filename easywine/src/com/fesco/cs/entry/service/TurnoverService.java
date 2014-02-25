package com.fesco.cs.entry.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fesco.cs.entry.dao.TurnoverDao;
import com.fesco.cs.entry.pojo.EntryInfo;

@Service("turnoverService")
public class TurnoverService {

	@Resource(name="turnoverDao")
	private TurnoverDao td;
	
	public List<EntryInfo> getEmployeeEntryInfo(String onlyNum){
		return td.getStaffEntryInfo(onlyNum);
	}
	
	public List<EntryInfo> getEmployeeDismissionInfo(String onlyNum){
		return td.getStaffDismissionInfo(onlyNum);
	}
}
