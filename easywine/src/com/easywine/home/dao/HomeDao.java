package com.easywine.home.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.easywine.home.pojo.Menu;


@Repository("homeDao")
public class HomeDao {
	
	@Autowired
	private JdbcTemplate MenujdbcTemplate;

	public List<Menu> findMenuParentMenuList() {
		List<Menu> Menus = new ArrayList<Menu>();
		String sql = "SELECT * FROM grape WHERE parent_id = 0";
		Menus = MenujdbcTemplate.query(sql, new RowMapper<Menu>() {

			public Menu mapRow(ResultSet rs, int arg1) throws SQLException {
				Menu m = new Menu();
				m.setMenu_id(rs.getInt("grape_id"));
				m.setMenu_code(rs.getString("grape_code"));
				m.setMenu_name(rs.getString("grape_name"));
				m.setMenu_eName("grape_e_name");
				m.setParent_id(rs.getInt("parent_id"));
				return m;
			}
		});
		return Menus;
	}

	public List<Menu> findMenuSubMenuList() {
		List<Menu> menus = new ArrayList<Menu>();
		String sql = "SELECT * FROM grape WHERE parent_id != 0";
		menus = MenujdbcTemplate.query(sql, new RowMapper<Menu>(){

			public Menu mapRow(ResultSet rs, int arg1) throws SQLException {
				Menu m = new Menu();
				m.setMenu_id(rs.getInt("grape_id"));
				m.setMenu_code(rs.getString("grape_code"));
				m.setMenu_name(rs.getString("grape_name"));
				m.setMenu_eName("grape_e_name");
				m.setParent_id(rs.getInt("parent_id"));
				return m;
			}});
		
		return menus;
	}

}
