package com.cedarera.common.viewresolver;

import java.util.Locale;
import java.util.Map;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.cedarera.common.exception.CedareraViewResolverException;

/**
 * @ file_name MultiViewResolver.java
 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
 * @ date 2012-9-12下午5:27:28
 * @ description
 * @ reviewed_by 
 */
public class MultiViewResolver implements ViewResolver{

    //多视图Map 视图的使用:_视图标识
	private Map<String, ViewResolver> viewResolvers;
	
	public View resolveViewName(String viewName, Locale locale) throws CedareraViewResolverException {
		//依据最后一个_的位置确定视图的标识
		int suffix_start_num = viewName.lastIndexOf("_");
		//不存在视图
		if(suffix_start_num==-1){
			throw new CedareraViewResolverException("您返回的视图名格式有错误，选择所使用的视图时请使用“_”隔开");
		}
		//得到字符串后缀，即：视图标识
		String suffix = viewName.substring(suffix_start_num+1);
		//从viewResolvers得到需要的视图
		ViewResolver viewResolver = viewResolvers.get(suffix);
		if(viewResolver==null){
			throw new CedareraViewResolverException("找不到视图,请确认下画线(“_”)后视图标识是否正确");
		}
	    //解析得到视图名
		viewName = viewName.substring(0,suffix_start_num);
		//判断视图名
	    if(viewName==null||"".equals(viewName)){
	    	throw new CedareraViewResolverException("您返回的视图名格式有错误,下画线(“_”)前需要选择视图不能为空");
	    }
		try {
			//返回视图
			return viewResolver.resolveViewName(viewName, locale);
		} catch (Exception e) {
			throw new CedareraViewResolverException(e.getMessage());
		}
	}

	public Map<String, ViewResolver> getViewResolvers() {
		return viewResolvers;
	}

	public void setViewResolvers(Map<String, ViewResolver> viewResolvers) {
		this.viewResolvers = viewResolvers;
	}
    
}
