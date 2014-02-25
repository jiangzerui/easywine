package com.cedarera.menu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedarera.common.exception.CedareraAppException;
import com.cedarera.menu.entity.Menu;
import com.cedarera.menu.persistence.MenuMapper;
import com.cedarera.menu.service.IMenuService;

/**
 * @ file_name MenuServiceMyBatisImpl.java
 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
 * @ date 2013-4-9上午11:38:09
 * @ description
 * @ reviewed_by 
 */
@Service("menuService")
public class MenuServiceMyBatisImpl implements IMenuService {

	
	@Autowired
	private MenuMapper menuMapper;
	
	private Logger logger = LoggerFactory.getLogger(MenuServiceMyBatisImpl.class);
	/*
	 * (non-Javadoc)
	 * @see com.cedarera.menu.service.IMenuService#findByParentCode()
	 */
	public List<Menu> findByParentCode(String parentCode) throws CedareraAppException {
		try {
		   
			logger.info("find menu by parentCode："+parentCode);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("parentCode", parentCode);
			List<Menu> menus = menuMapper.queryByParentCode(map);
			logger.info("find success");
			return menus;
		} catch (CedareraAppException e) {
			logger.error("error:"+e);
            throw new CedareraAppException(e.getMessage());  
		}
		
	}

}
