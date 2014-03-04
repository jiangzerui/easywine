package com.easywine.home.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.easywine.home.pojo.Menu;
import com.easywine.home.service.HomeService;

@Controller
@RequestMapping("")
public class HomeController {
	
	@Resource(name="homeService")
	private HomeService homeService;

	@RequestMapping("")
	public String portalPage( Model model ){
		List<Menu> list = homeService.findProjectMenuList();
		model.addAttribute("menus", list);
		model.addAttribute("menu_index", 0);
		return "frontviews/easywine/portal";
	}
	
	@RequestMapping("aboutus")
	public String aboutusPage( Model model ){
		List<Menu> list = homeService.findProjectMenuList();
		model.addAttribute("menus", list);
		model.addAttribute("menu_index", 1);
		return "frontviews/easywine/about";
	}
	
	@RequestMapping("blog")
	public String blogPage( Model model ){
		List<Menu> list = homeService.findProjectMenuList();
		model.addAttribute("menus", list);
		model.addAttribute("menu_index", 3);
		return "frontviews/easywine/blog";
	}

	@RequestMapping("contact")
	public String contactPage( Model model ){
		List<Menu> list = homeService.findProjectMenuList();
		model.addAttribute("menus", list);
		model.addAttribute("menu_index", 4);
		return "frontviews/easywine/contact";
	}
	
	@RequestMapping("joinus")
	public String joinusPage( Model model ){
		List<Menu> list = homeService.findProjectMenuList();
		Map<String , Object> resMap = homeService.findAddProjectSelectOption();
		model.addAttribute("menus", list);
		model.addAttribute("resMap", resMap);
		model.addAttribute("menu_index", 5);
		return "frontviews/easywine/joinus";
	}
	
	/**
	 * 
	 *@description 此方法描述的是：
	 *@author mf-luozg 
	 *@version 2014年3月4日上午1:39:49.
	 *@param type( 由 parent_id, current_type_id ， 如 ：2,6)
	 */
	@RequestMapping("object")
	public String objectPage( Model model, @RequestParam String type ){
		List<Menu> list = homeService.findProjectMenuList();
		model.addAttribute("menus", list);
		model.addAttribute("menu_index", 2);
		return "frontviews/easywine/object-list";
	}
	
	
}