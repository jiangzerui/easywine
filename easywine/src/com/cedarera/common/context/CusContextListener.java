package com.cedarera.common.context;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

/**
 * @ file_name MyContextListener.java
 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
 * @ date 2012-9-12下午5:14:08
 * @ description
 * @ reviewed_by 
 */
public class CusContextListener extends ContextLoaderListener{

	
	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.context.ContextLoaderListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		//do something
		/*可以在初始化完后执行一些操作，比如清空在线人数表，使可以在另一个系统查看当前人数*/
	}
}
