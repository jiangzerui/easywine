package com.easywine.home.pojo;

import java.util.List;

public class Menu {
	
	private Integer menu_id;
	private String menu_code;
	private String menu_name;
	private String menu_eName;
	private Integer parent_id;
	
	private List<Menu> sub_menus;

	public Integer getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}

	public String getMenu_code() {
		return menu_code;
	}

	public void setMenu_code(String menu_code) {
		this.menu_code = menu_code;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getMenu_eName() {
		return menu_eName;
	}

	public void setMenu_eName(String menu_eName) {
		this.menu_eName = menu_eName;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public List<Menu> getSub_menus() {
		return sub_menus;
	}

	public void setSub_menus(List<Menu> sub_menus) {
		this.sub_menus = sub_menus;
	}

}
