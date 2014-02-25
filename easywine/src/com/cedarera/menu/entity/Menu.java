package com.cedarera.menu.entity;

import java.util.ArrayList;
import java.util.List;

import com.cedarera.base.entity.Base;

/**
 * @ file_name Menu.java
 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
 * @ date 2013-4-9上午10:56:15
 * @ description
 * @ reviewed_by 
 */
public class Menu extends Base {
	/*菜单ID*/
	private Integer menuId;
	/*编码*/
	private String menuCode;
	/*名称*/
	private String menuName;
	/*菜单URL*/
	private String menuUrl;
	/*菜单旁边显示的图片*/
	private String menuImage;
	/*菜单描述*/
	private String menuDescription;
	/*菜单排序*/
	private int menuSort;
	/*父级菜单ID*/
	private Integer parentId;
	/*父级菜单编码*/
	private String parentCode;
	
	/*子菜单*/
	private List<Menu> childrens = new ArrayList<Menu>();
	/**
	 * 
	 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
	 * @ date 2013-4-9上午11:02:17
	 * @ description 
	 * @ reviewed_by
	 */
	public Menu() {
		
	}
	
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public String getMenuImage() {
		return menuImage;
	}
	public void setMenuImage(String menuImage) {
		this.menuImage = menuImage;
	}
	public String getMenuDescription() {
		return menuDescription;
	}
	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}
	public int getMenuSort() {
		return menuSort;
	}
	public void setMenuSort(int menuSort) {
		this.menuSort = menuSort;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public List<Menu> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<Menu> childrens) {
		this.childrens = childrens;
	}
	

}
