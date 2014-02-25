package com.fesco.cs.accumulation.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fesco.cs.accumulation.pojo.AccumulationBase;
import com.fesco.cs.employee.pojo.EmployeeBase;

@Repository("accumulationDao")
public class AccumulationDao {

	@Autowired
	private JdbcTemplate fescojdbcTemplate;
	
	public String getCurrentDBTable(){
		String DBTableName = null;
		String sql = "select replace(verb_str,'公积金Private库当前版本','sb_zf_pri') from doc_code where Inner_str='PRIVER'";
		DBTableName = fescojdbcTemplate.queryForObject(sql, new RowMapper<String>(){
			@Override
			public String mapRow(ResultSet rs, int arg1) throws SQLException {
				return rs.getString(1);
			}
		});
		return DBTableName;
	}
	
	public AccumulationBase getAccumulationInfo(String onlyNum){
		//sb_zf_pri20140207
		String tableName = getCurrentDBTable().trim();
		String sql = "select lpad(t1.unitregid, 6, '0') UNITREG, t1.*,t3.*,t2.DWMC,t2.rem1 HouseCenter,t2.rem2 HouseCenterNO from "
		+tableName +" t1 left join sb_zf_ratio t3 on t3.grbh = t1.personno and t3.dwdjh = lpad(t1.unitregid, 6, '0'),"
				+ "sb_zf_dwdjh t2 where t2.dwdjh = lpad(t1.unitregid, 6, '0') and t1.empno = "+onlyNum
		;

		AccumulationBase ab = null;
		
			List<AccumulationBase> strLst  = fescojdbcTemplate.query(sql,
		            new RowMapper<AccumulationBase>() {
						@SuppressWarnings("deprecation")
						public AccumulationBase mapRow(ResultSet rs, int rowNum) throws SQLException {
							AccumulationBase accumulation = new AccumulationBase();
							accumulation.setHouseCenter(rs.getString("HOUSECENTER"));
							accumulation.setHouseCenterNo(rs.getString("UNITREG"));
							accumulation.setOnlyNum(rs.getString("PERSONNO"));
							accumulation.setPersonName(rs.getString("PERSONNAME"));
							accumulation.setPersonID(rs.getString("IDCARD"));
							accumulation.setBankAccount(rs.getString("CXKH"));
							accumulation.setStatus(rs.getString("SAVESTATUS"));
							if(rs.getString("CURRENTSUM") != null){
								accumulation.setAccountBlanace(new BigDecimal(rs.getString("CURRENTSUM")));
							}
							if(rs.getString("THISYEARSAVE") != null){
								accumulation.setDeposit(new BigDecimal(rs.getString("THISYEARSAVE")));
							}
							if(rs.getString("THISYEARDRAW") != null){
								accumulation.setWithdraw(new BigDecimal(rs.getString("THISYEARDRAW")));
							}
							if(rs.getString("LASTYEARTRANS") != null){
								accumulation.setForwardBlanace(new BigDecimal(rs.getString("LASTYEARTRANS")));
							}
							if(rs.getString("BNZQ") != null){
								accumulation.setLastYearExtration(new BigDecimal(rs.getString("BNZQ")));
							}
							accumulation.setOrganization(rs.getString("DWMC"));
							accumulation.setHouseCenterCode(rs.getString("HOUSECENTERNO"));
							if(rs.getString("JXLX")!=null){
								accumulation.setInterest(new BigDecimal(rs.getString("JXLX")));
							}
							accumulation.setBankName(rs.getString("KHH"));
							accumulation.setNextDepositDate(rs.getString("DQHJNY"));
							return accumulation;
		            }
		});
		if ( strLst.isEmpty() ){
		  return null;
		}else if ( strLst.size() == 1 ) { // list contains exactly 1 element
		  return ab = strLst.get(0);
		}else{  // list contains more than 1 elements
		  //your wish, you can either throw the exception or return 1st element.
		}
		return ab;
	}
}
