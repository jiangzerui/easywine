package com.easywine.home.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.easywine.code.dao.CodeDao;
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
import com.easywine.code.pojo.Sweetness;
import com.easywine.code.pojo.Tannin;
import com.easywine.home.dao.HomeDao;
import com.easywine.home.pojo.Menu;

@Service("homeService")
public class HomeService {
	
	@Resource(name="homeDao")
	private HomeDao homeDao;
	
	@Resource(name="codeDao")
	private CodeDao codeDao;

	public List<Menu> findProjectMenuList() {
		List<Menu> p_menus = homeDao.findMenuParentMenuList(  );
		List<Menu> sub_menus = homeDao.findMenuSubMenuList(  );
		return formatProjectMenuList( p_menus, sub_menus );
	}

	/**
	 * 
	 *@description 此方法描述的是：
	 *@author mf-luozg 
	 *@version 2014年3月2日下午10:08:59.
	 */
	private List<Menu> formatProjectMenuList(List<Menu> p_menus,
			List<Menu> sub_menus) {
		for (int i = 0; i < p_menus.size(); i++) {
			List<Menu> list = new ArrayList<Menu>();
			for (int j = 0; j < sub_menus.size(); j++) {
				if (p_menus.get(i).getMenu_id() == sub_menus.get(j).getParent_id()) {
					list.add(sub_menus.get(j));
				}
			}
			p_menus.get(i).setSub_menus(list);
		}
		return p_menus;
	}

	public Map<String, Object> findAddProjectSelectOption() {
		Map<String, Object> resMap = new HashMap<String, Object>();
		
		List<Acidity> acidities = codeDao.getAcidityAll();// 得到所有的酸度属性
		resMap.put("acidities", acidities);
		
		List<Body> bodies = codeDao.getBodyAll();// 得到所有酒体属性
		resMap.put("bodies", bodies);
		
		List<Clarity> clarities = codeDao.getClarityAll();// 得到所有澄清度属性
		resMap.put("clarities", clarities);
		
		List<Climate> climates = codeDao.getClimateAll();// 得到所有气候属性
		resMap.put("climates", climates);
		
		List<Colour> colours = codeDao.getColourAll();// 得到所有颜色属性
		resMap.put("colours", colours);
		
		List<Condition> conditions = codeDao.getConditionAll();// 得到所有条件属性
		resMap.put("conditions", conditions);
		
		List<Country> countries = codeDao.getCountryAll();// 得到所有国家属性
		resMap.put("countries", countries);
		
		List<Finish> finishs = codeDao.getFinishAll();// 得到所有回味的属性
		resMap.put("finishs", finishs);
		
		List<Flavour> flavours = codeDao.getFlavourAll();// 得到所有香味属性
		resMap.put("flavours", flavours);
		
		List<Flavour> relishs = codeDao.getRelishAll();// 得到所有风味属性
		resMap.put("relishs", relishs);
		
		List<Intensity> intensities = codeDao.getIntensityAll();// 得到所有颜色强度属性
		resMap.put("intensities", intensities);
		
		List<Intensity> richs = codeDao.getRichAll();// 得到所有颜色强度属性
		resMap.put("richs", richs);
		
		List<Quality> qualities = codeDao.getQualityAll();// 得到所有品质属性
		resMap.put("qualities", qualities);
		
		List<Sweetness> sweetnesses = codeDao.getSweetnessAll();// 拿到甜度属性
		resMap.put("sweetnesses", sweetnesses);
		
		List<Tannin> tannins = codeDao.getTanninAll();// 得到单宁酸属性
		resMap.put("tannins", tannins);
		
		List<Menu> grapes = homeDao.findMenuSubMenuList(  );
		resMap.put("grapes", grapes);
		
		return resMap;
	}
}
