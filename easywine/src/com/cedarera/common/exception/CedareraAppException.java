package com.cedarera.common.exception;

/**
 * @ file_name StudyAppException.java
 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
 * @ date 2012-9-13����1:43:00
 * @ description
 * @ reviewed_by 
 */
public class CedareraAppException extends CedareraException{

	/**
	 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
	 * @ date 2012-9-13下午2:09:42
	 * @ description 
	 * @ reviewed_by 
	 */
	private static final long serialVersionUID = -8041806553625551818L;
    /**
     * 
     * 
     * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
     * @ date 2012-9-13下午2:55:47
     * @ description 
     * @ reviewed_by
     */
	public CedareraAppException() {

	}
	/**
	 * 
	 * @param msg
	 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
	 * @ date 2012-9-13下午2:55:42
	 * @ description 
	 * @ reviewed_by
	 */
	public CedareraAppException(String msg){
		super(msg);
	}
}
