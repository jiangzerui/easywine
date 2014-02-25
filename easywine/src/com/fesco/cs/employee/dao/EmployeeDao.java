package com.fesco.cs.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fesco.cs.employee.pojo.EmployeeBase;

@Repository("employeeDao")
public class EmployeeDao {

	@Autowired
	private JdbcTemplate fescojdbcTemplate;
	
	public EmployeeBase getEmployeeBaseInfo(String onlyNum){
		EmployeeBase emp =null;
		String sql = "select t1.wyh,des3decode(t2.cryptstr) EMPPASS,t1.xm,t1.sfzh,decode(t2.status,1,'开通','未开通') OPENSTATE,t2.email,t2.phone,t3.ssmc,t3.ssbh,t3.fzbh from ryjck t1  left join callcenter_pwd t2 on t1.wyh = t2.custno and t2.custauxno=0 left join pck t3 on t3.wyh= t1.wyh where t1.wyh=? order by t1.wyh";
		emp = fescojdbcTemplate.queryForObject(sql, new Object[]{onlyNum.trim()}, new RowMapper<EmployeeBase>(){
			
			@Override
			public EmployeeBase mapRow(ResultSet rs, int arg1)
					throws SQLException {
				EmployeeBase employee = new EmployeeBase();
					employee.setName(rs.getString("xm"));
					employee.setOnlyNum(rs.getString("wyh"));
					employee.setPersonID(rs.getString("sfzh"));
					employee.seteMail(rs.getString("email"));
				    employee.setPhone(rs.getString("phone"));
					employee.setOrganization(rs.getString("ssmc"));
					employee.setOrganizationCode(rs.getString("ssbh"));
					employee.setOrganization(rs.getString("fzbh"));
					employee.setState(rs.getString("OPENSTATE"));
				return employee;
			}
		});
		return emp;
	}
}
