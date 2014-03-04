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
import com.easywine.code.pojo.Condition;
import com.easywine.code.pojo.Country;
import com.easywine.code.pojo.Finish;
import com.easywine.code.pojo.Flavour;
import com.easywine.code.pojo.Intensity;
import com.easywine.code.pojo.Quality;
import com.easywine.code.pojo.Region;
import com.easywine.code.pojo.Sweetness;
import com.easywine.code.pojo.Tannin;

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
				colour.setColourType(rs.getInt("colour_type"));
				return colour;
			}
		});
		if (colours.isEmpty()) {
			return null;
		} else {
			return colours;
		}
	}

	// 得到所有条件属性
	public List<Condition> getConditionAll() {
		String sql = "SELECT * FROM `condition` ORDER BY condition_code";

		List<Condition> conditions = jdbcTemplate.query(sql,
				new RowMapper<Condition>() {
					@Override
					public Condition mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Condition condition = new Condition();
						condition.setConditionID(rs.getInt("condition_id"));
						condition.setConditionCode(rs.getInt("condition_code"));
						condition.setConditionName(rs
								.getString("condition_name"));
						condition.setConditionEName(rs
								.getString("condition_e_name"));
						return condition;
					}
				});
		if (conditions.isEmpty()) {
			return null;
		} else {
			return conditions;
		}
	}

	// 得到所有国家属性
	public List<Country> getCountryAll() {
		String sql = "select * from country order by country_code";
		List<Country> countries = jdbcTemplate.query(sql,
				new RowMapper<Country>() {
					@Override
					public Country mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Country country = new Country();
						country.setCountryID(rs.getInt("country_id"));
						country.setCountryCode(rs.getInt("country_code"));
						country.setCountryName(rs.getString("country_name"));
						country.setCountryEName(rs.getString("country_e_name"));
						return country;
					}
				});
		if (countries.isEmpty()) {
			return null;
		} else {
			return countries;
		}
	}

	// 得到所有余味的属性
	public List<Finish> getFinishAll() {
		String sql = "select * from finish order by finish_code";
		List<Finish> finishs = jdbcTemplate.query(sql, new RowMapper<Finish>() {
			@Override
			public Finish mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Finish finish = new Finish();
				finish.setFinishID(rs.getInt("finish_id"));
				finish.setFinishCode(rs.getInt("finish_code"));
				finish.setFinishName(rs.getString("finish_name"));
				finish.setFinishEName(rs.getString("finish_e_name"));
				return finish;
			}
		});
		if (finishs.isEmpty()) {
			return null;
		} else {
			return finishs;
		}
	}

	// 得到所有香味属性
	public List<Flavour> getFlavourAll() {
		String sql = "select * from flavour WHERE flavour_type = 1 order by flavour_code";

		List<Flavour> flavours = jdbcTemplate.query(sql,
				new RowMapper<Flavour>() {
					@Override
					public Flavour mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Flavour flavour = new Flavour();
						flavour.setFlavourID(rs.getInt("flavour_id"));
						flavour.setFlavourCode(rs.getInt("flavour_code"));
						flavour.setFlavourName(rs.getString("flavour_name"));
						flavour.setFlavourEName(rs.getString("flavour_e_name"));
						flavour.setFlavourType(rs.getInt("flavour_type"));
						return flavour;
					}
				});
		if (flavours.isEmpty()) {
			return null;
		} else {
			return flavours;
		}
	}
	
	// 得到所有风味属性
	public List<Flavour> getRelishAll() {
		String sql = "select * from flavour WHERE flavour_type = 2 order by flavour_code";

		List<Flavour> flavours = jdbcTemplate.query(sql,
				new RowMapper<Flavour>() {
					@Override
					public Flavour mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Flavour flavour = new Flavour();
						flavour.setFlavourID(rs.getInt("flavour_id"));
						flavour.setFlavourCode(rs.getInt("flavour_code"));
						flavour.setFlavourName(rs.getString("flavour_name"));
						flavour.setFlavourEName(rs.getString("flavour_e_name"));
						flavour.setFlavourType(rs.getInt("flavour_type"));
						return flavour;
					}
				});
		if (flavours.isEmpty()) {
			return null;
		} else {
			return flavours;
		}
	}

	// 得到所有颜色属性
	public List<Intensity> getIntensityAll() {
		String sql = "select * from intensity WHERE intensity_type = 1 order by intensity_code";

		List<Intensity> intensities = jdbcTemplate.query(sql,
				new RowMapper<Intensity>() {
					@Override
					public Intensity mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Intensity intensity = new Intensity();
						intensity.setIntensityID(rs.getInt("intensity_id"));
						intensity.setIntensityCode(rs.getInt("intensity_code"));
						intensity.setIntensityName(rs.getString("intensity_name"));
						intensity.setIntensityEName(rs
								.getString("intensity_e_name"));
						return intensity;
					}
				});
		if (intensities.isEmpty()) {
			return null;
		} else {
			return intensities;
		}
	}
	
	// 得到所有颜色属性
	public List<Intensity> getRichAll() {
		String sql = "select * from intensity WHERE intensity_type = 2 order by intensity_code";

		List<Intensity> intensities = jdbcTemplate.query(sql,
				new RowMapper<Intensity>() {
					@Override
					public Intensity mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Intensity intensity = new Intensity();
						intensity.setIntensityID(rs.getInt("intensity_id"));
						intensity.setIntensityCode(rs.getInt("intensity_code"));
						intensity.setIntensityName(rs.getString("intensity_name"));
						intensity.setIntensityEName(rs
								.getString("intensity_e_name"));
						return intensity;
					}
				});
		if (intensities.isEmpty()) {
			return null;
		} else {
			return intensities;
		}
	}

	// 得到所有颜色属性
	public List<Quality> getQualityAll() {
		String sql = "select * from quality order by quality_code";

		List<Quality> qualities = jdbcTemplate.query(sql,
				new RowMapper<Quality>() {
					@Override
					public Quality mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Quality quality = new Quality();
						quality.setQualityID(rs.getInt("quality_id"));
						quality.setQualityCode(rs.getInt("quality_code"));
						quality.setQualityName(rs.getString("quality_name"));
						quality.setQualityEName(rs.getString("quality_e_name"));
						return quality;
					}
				});
		if (qualities.isEmpty()) {
			return null;
		} else {
			return qualities;
		}
	}

	// 得到所有地区属性
	public List<Region> getRegionAll() {
		String sql = "select * from region order by region_code";

		List<Region> regions = jdbcTemplate.query(sql, new RowMapper<Region>() {
			@Override
			public Region mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Region region = new Region();
				region.setRegionID(rs.getInt("quality_id"));
				region.setRegionCode(rs.getInt("quality_code"));
				region.setRegionName(rs.getString("quality_name"));
				region.setRegionEName(rs.getString("quality_e_name"));
				return region;
			}
		});
		if (regions.isEmpty()) {
			return null;
		} else {
			return regions;
		}

	}

	// 拿到甜度属性
	public List<Sweetness> getSweetnessAll() {
		String sql = "select * from sweetness order by sweetness_code";
		List<Sweetness> sweetnesses = jdbcTemplate.query(sql,
				new RowMapper<Sweetness>() {
					@Override
					public Sweetness mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						Sweetness sweetness = new Sweetness();
						sweetness.setSweetnessID(rs.getInt("sweetness_id"));
						sweetness.setSweetnessCode(rs.getInt("sweetness_code"));
						sweetness.setSweetnessName(rs
								.getString("sweetness_name"));
						sweetness.setSweetnessEName(rs
								.getString("sweetness_e_name"));
						return sweetness;
					}
				});
		if (sweetnesses.isEmpty()) {
			return null;
		} else {
			return sweetnesses;
		}
	}

	// 拿到甜度属性
	public List<Tannin> getTanninAll() {
		String sql = "select * from tannin order by tannin_code";
		List<Tannin> Tannins = jdbcTemplate.query(sql, new RowMapper<Tannin>() {
			@Override
			public Tannin mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Tannin tannin = new Tannin();
				tannin.setTanninID(rs.getInt("tannin_id"));
				tannin.setTanninCode(rs.getInt("tannin_code"));
				tannin.setTanninName(rs.getString("tannin_name"));
				tannin.setTanninEName(rs.getString("tannin_e_name"));
				return tannin;
			}
		});
		if (Tannins.isEmpty()) {
			return null;
		} else {
			return Tannins;
		}
	}
}
