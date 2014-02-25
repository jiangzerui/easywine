package com.cedarera.menu.persistence;

import java.util.List;
import java.util.Map;

import com.cedarera.base.persistence.BaseMapper;
import com.cedarera.common.exception.CedareraAppException;
import com.cedarera.menu.entity.Menu;

/**
 * @ file_name MenuMapper.java
 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
 * @ date 2013-4-9上午11:03:14
 * @ description
 * @ reviewed_by 
 */
public interface MenuMapper extends BaseMapper<Menu>{

	/**
	 * 
	 * @ List<Menu> findByParentCode(MenuMapper)
	 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
	 * @ date 2013-4-9上午11:09:55
	 * @ description 按照parentCode 查找直接子一级的菜单树，如果parentCode为null的话，查找顶级菜单树
	 * @ reviewed_by
	 */
	public List<Menu> queryByParentCode(Map<String, Object> parentCode) throws CedareraAppException;
	
	
}
