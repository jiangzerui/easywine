package com.cedarera.menu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cedarera.common.exception.CedareraException;
import com.cedarera.menu.entity.Menu;
import com.cedarera.menu.service.IMenuService;

/**
 * @ file_name MenuController.java @ author liu.sheng.qi
 * (liu.sheng.qi@fesco.com.cn) @ date 2013-4-9上午11:36:42 @ description @
 * reviewed_by
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

	@Resource(name = "menuService")
	private IMenuService menuService;

	/**
	 * 
	 * @ String findSubMenu(MenuController) @ author liu.sheng.qi
	 * (liu.sheng.qi@fesco.com.cn) @ date 2013-4-11上午10:22:15 @ description @
	 * reviewed_by
	 */
	@RequestMapping("/list/{menuCode}")
	public String findSubMenu(@PathVariable String menuCode, Model model)
			throws CedareraException {
		List<Menu> menus = menuService.findByParentCode(menuCode);
		model.addAttribute("menus", menus);
		return "menu/sub-menu";
	}

	
}
