package com.fesco.cs.medical.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fesco.cs.medical.pojo.MedicalInsurance;

@Repository("mDao")
public class MedicalInsuranceDao {

	@Autowired
	private JdbcTemplate fescojdbcTemplate;
	
	public List<MedicalInsurance> getMedicalInsuranceRecord(String onlyNum){
		String sql = "select bi_id, bi_wyh, decode(bi_type,1,'本人',2,'子女','') bi_type, to_char(bi_date,'YYYY-MM-DD') bi_date, bi_requestfee, bi_realfee, bi_feereason, bi_operateperson from callcenter_billinfo where bi_wyh="+onlyNum+" order by bi_date";
	    List<MedicalInsurance> mis = new ArrayList<MedicalInsurance>();
	    mis = fescojdbcTemplate.query(sql, new RowMapper<MedicalInsurance>(){

			@Override
			public MedicalInsurance mapRow(ResultSet rs, int arg1)
					throws SQLException {
				// TODO Auto-generated method stub
				MedicalInsurance mi = new MedicalInsurance();
				mi.setCompensate(rs.getDate("bi_date"));
				mi.setcType(rs.getString("bi_type"));
				if(rs.getString("bi_requestfee")!= null){
					mi.setRequestCompensate(new BigDecimal(rs.getString("bi_requestfee")));
				}
				if(rs.getString("bi_realfee")!=null){
					mi.setRealCompensate(new BigDecimal(rs.getString("bi_realfee")));
				}
				mi.setReason(rs.getString("bi_feereason"));
				return mi;
			}
	    });
	    if(mis.isEmpty()){
	    		return null;
	    }else{
	    	   return mis;
	    }
	}
}
