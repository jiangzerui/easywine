package com.cedarera.menu.service;

import java.util.List;

import com.cedarera.common.exception.CedareraAppException;
import com.cedarera.menu.entity.Menu;

/**
 * @ file_name IMenuService.java
 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
 * @ date 2013-4-9上午11:06:56
 * @ description
 * @ reviewed_by 
 */
public interface IMenuService {
    /**
     * 
     * @ List<Menu> findByParentCode(IMenuService)
     * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
     * @ date 2013-4-9上午11:41:16
     * @ description 按父级编码查找子菜单，当parentCode为空的时候，查找顶级菜单
     * @ reviewed_by
     */
	public List<Menu> findByParentCode(String parentCode)throws CedareraAppException;
	
}
