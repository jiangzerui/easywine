package com.cedarera.common.controller;


import java.util.List;

import javax.annotation.Resource;

import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.cedarera.common.exception.CedareraAppException;
import com.cedarera.menu.entity.Menu;
import com.cedarera.menu.service.IMenuService;

/**
 * @ file_name HomeController.java
 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
 * @ date 2012-9-13下午1:41:37
 * @ description
 * @ reviewed_by 
 */
@Controller
@RequestMapping("")
public class HomeController{
	
	
	@Resource(name="menuService")
	private IMenuService menuService;
	
    /**
     * 
     * @ String toLogin(HomeController)
     * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
     * @ date 2012-9-13下午1:44:27
     * @ description to login page
     * @ reviewed_by
     */
	@RequestMapping("/login")
	public String toLogin()throws CedareraAppException{
		return "login";
	}
	/**
	 * 
	 * @ String toMain(HomeController)
	 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
	 * @ date 2012-9-13下午3:36:30
	 * @ description 
	 * @ reviewed_by
	 */
	@RequestMapping("")
	public String toMain(Model model)throws CedareraAppException{
		//初始化顶级菜单
		List<Menu> menus = menuService.findByParentCode(null);
		//JSON化
		String jsonMenus = JSON.toJSONString(menus);
		
		model.addAttribute("menus", jsonMenus);
		return "login";
	}
	
}
