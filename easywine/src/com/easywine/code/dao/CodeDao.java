package com.easywine.code.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.easywine.code.pojo.Acidity;
import com.easywine.code.pojo.Body;
import com.easywine.code.pojo.Clarity;
import com.easywine.code.pojo.Climate;
import com.easywine.code.pojo.Colour;

@Repository("codeDao")
public class CodeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// 得到所有的酸度属性
	public List<Acidity> getAcidityAll() {
		String sql = "select * from acidity order by acidity_code";

		List<Acidity> acidities = jdbcTemplate.query(sql,
				new RowMapper<Acidity>() {

					@Override
					public Acidity mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Acidity acidity = new Acidity();
						acidity.setAcidityID(rs.getInt("acidity_id"));
						acidity.setAcidityCode(rs.getInt("acidity_code"));
						acidity.setAcidityName(rs.getString("acidity_name"));
						acidity.setAcidityEName(rs.getString("acidity_e_name"));
						return acidity;
					}
				});
		if (acidities.isEmpty()) {
			return null;
		} else {
			return acidities;
		}
	}

	// 得到所有酒体属性
	public List<Body> getBodyAll() {
		String sql = "select * from body order by body_code";

		List<Body> bodys = jdbcTemplate.query(sql, new RowMapper<Body>() {
			@Override
			public Body mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Body body = new Body();
				body.setBodyID(rs.getInt("body_id"));
				body.setBodyCode(rs.getInt("body_code"));
				body.setBodyName(rs.getString("body_name"));
				body.setBodyEName(rs.getString("body_e_name"));
				return body;
			}
		});
		if (bodys.isEmpty()) {
			return null;
		} else {
			return bodys;
		}
	}

	// 得到所有澄清度属性
	public List<Clarity> getClarityAll() {
		String sql = "select * from clarity order by clarity_code";

		List<Clarity> clarities = jdbcTemplate.query(sql,
				new RowMapper<Clarity>() {
					@Override
					public Clarity mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Clarity clarity = new Clarity();
						clarity.setClarityID(rs.getInt("clarity_id"));
						clarity.setClarityCode(rs.getInt("clarity_code"));
						clarity.setClarityName(rs.getString("clarity_name"));
						clarity.setClarityEName(rs.getString("clarity_e_name"));
						return clarity;
					}
				});
		if (clarities.isEmpty()) {
			return null;
		} else {
			return clarities;
		}
	}

	// 得到所有气候属性
	public List<Climate> getClimateAll() {
		String sql = "select * from climate order by climate_code";

		List<Climate> climaties = jdbcTemplate.query(sql,
				new RowMapper<Climate>() {
					@Override
					public Climate mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Climate climate = new Climate();
						climate.setClimateID(rs.getInt("climate_id"));
						climate.setClimateCode(rs.getInt("climate_code"));
						climate.setClimateName(rs.getString("climate_name"));
						climate.setClimateEName(rs.getString("climate_e_name"));
						return climate;
					}
				});
		if (climaties.isEmpty()) {
			return null;
		} else {
			return climaties;
		}
	}

	// 得到所有颜色属性
	public List<Colour> getColourAll() {
		String sql = "select * from colour order by colour_code";

		List<Colour> colours = jdbcTemplate.query(sql, new RowMapper<Colour>() {
			@Override
			public Colour mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Colour colour = new Colour();
				colour.setColourID(rs.getInt("colour_id"));
				colour.setColourCode(rs.getInt("colour_code"));
				colour.setColourName(rs.getString("colour_name"));
				colour.setColourEName(rs.getString("colour_e_name"));
				
				return colour;
			}
		});
		if (colours.isEmpty()) {
			return null;
		} else {
			return colours;
		}
	}

}
