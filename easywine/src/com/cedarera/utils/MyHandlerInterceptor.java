package com.cedarera.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @ file_name MyHandlerInterceptor.java
 * @ author liusq (liusq@tarena.com.cn)
 * @ date 2012-5-8下午03:04:02
 * @ description
 * @ reviewed_by 
 */
public class MyHandlerInterceptor extends HandlerInterceptorAdapter{

/*
 * (non-Javadoc)
 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
	
	//	String url = request.getRequestURI();
		/*if(url.endsWith("cedarera/")||url.endsWith("login")){
		    return true;
		}
		if(request.getSession().getAttribute(Constants.USER_INFO_SESSION) == null){
			//if ajax request, session time out, reponse time out,else send redirect to index.jsp
			if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) { 
				response.setHeader("sessionstatus", "timeout"); 
				return false;
			}else{
				response.sendRedirect(request.getContextPath()+"/login");
				return false;
			}
		}*/
		return true;
	}
}
