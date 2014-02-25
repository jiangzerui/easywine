package com.fesco.cs.entry.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fesco.cs.entry.pojo.EntryInfo;

@Repository("turnoverDao")
public class TurnoverDao {

	@Autowired
	private JdbcTemplate fescojdbcTemplate;
	
	public List<EntryInfo> getStaffEntryInfo(String onlyNum){
		String sql = "select ssbh,fzbh,ssmc,to_char(pcrq,'YYYY-MM-DD') pcrq,to_char(pcblrq,'YYYY-MM-DD') pcblrq from pck  where wyh="+onlyNum+" order by pcrq";
	
		List<EntryInfo> eis = new ArrayList<EntryInfo>();
		eis = fescojdbcTemplate.query(sql, new RowMapper<EntryInfo>(){
			@Override
			public EntryInfo mapRow(ResultSet rs, int arg1)
					throws SQLException {
				// TODO Auto-generated method stub
				EntryInfo ei = new EntryInfo();
				ei.setOrganization(rs.getString("ssmc"));
				ei.setOrganizationCode(rs.getString("ssbh"));
				ei.setSecondCode(rs.getString("fzbh"));
				ei.setEntryDate(rs.getDate("pcrq"));
				ei.setSendDate(rs.getDate("pcblrq"));
				return ei;
			}
		});
		if ( eis.isEmpty() ){
			  return null;
			}else{  
				return eis;
			}
	}
	
	
	public List<EntryInfo> getStaffDismissionInfo(String onlyNum){
		String sql = "select ssbh,fzbh,ssmc,to_char(pcrq,'YYYY-MM-DD') pcrq,to_char(pcblrq,'YYYY-MM-DD') pcblrq,to_char(clrq,'YYYY-MM-DD') clrq,to_char(clblrq,'YYYY-MM-DD') clblrq from clk  where wyh="+onlyNum+"  order by clrq";
	
		List<EntryInfo> eis = new ArrayList<EntryInfo>();
		eis = fescojdbcTemplate.query(sql, new RowMapper<EntryInfo>(){
			@Override
			public EntryInfo mapRow(ResultSet rs, int arg1)
					throws SQLException {
				// TODO Auto-generated method stub
				EntryInfo ei = new EntryInfo();
				ei.setOrganization(rs.getString("ssmc"));
				ei.setOrganizationCode(rs.getString("ssbh"));
				ei.setSecondCode(rs.getString("fzbh"));
				ei.setEntryDate(rs.getDate("pcrq"));
				ei.setSendDate(rs.getDate("pcblrq"));
				ei.setDimission(rs.getDate("clrq"));
				ei.setDoDimission(rs.getDate("clblrq"));
				return ei;
			}
		});
		if ( eis.isEmpty() ){
			  return null;
			}else{  
				return eis;
			}
	}
}
