package com.cedarera.common.exception;

public class CedareraViewResolverException extends CedareraException{
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
	public CedareraViewResolverException() {

	}
	/**
	 * 
	 * @param msg
	 * @ author liu.sheng.qi (liu.sheng.qi@fesco.com.cn)
	 * @ date 2012-9-13下午2:55:42
	 * @ description 
	 * @ reviewed_by
	 */
	public CedareraViewResolverException(String msg){
		super(msg);
	}
}