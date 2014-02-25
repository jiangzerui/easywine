package com.cedarera.common.exception;

/**
 * @ file_name StudyException.java
 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
 * @ date 2012-9-13下午10:06:44
 * @ description
 * @ reviewed_by 
 */
public abstract class CedareraException extends Exception {

	/**
	 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
	 * @ date 2012-9-13下午10:10:30
	 * @ description 
	 * @ reviewed_by 
	 */
	private static final long serialVersionUID = -6952820412807725501L;
	
	public CedareraException() {
		
	}
	
	public CedareraException(String msg){
		super(msg);
	}
}
