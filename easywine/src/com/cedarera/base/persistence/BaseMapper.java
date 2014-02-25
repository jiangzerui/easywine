package com.cedarera.base.persistence;

import com.cedarera.base.entity.Base;


/**
 * @ file_name BaseMapper.java
 * @ author liusq (liusq@tarena.com.cn)
 * @ date 2012-5-14上午09:10:48
 * @ description 
 * BaseMapper 为所有Mapper的父接口�?
 * 集成了所有Mapper的增删改查公共方法，BaseMapper不能被Mybatis扫描�?
 * 因为 BaseMapper 不能有实现的 BaseMapper.xml 故放入DAO包中
 * @ reviewed_by 
 */
public interface BaseMapper<T extends Base> {
	/**
	 * 
	 * @ User load(UserMapper)
	 * @ author liusq (liusq@tarena.com.cn)
	 * @ date 2012-5-14下午12:02:39
	 * @ description 
	 * @ reviewed_by
	 */
	public T load(Integer id) throws Exception;
	/**
	 * 
	 * @ void save(UserMapper)
	 * @ author liusq (liusq@tarena.com.cn)
	 * @ date 2012-5-14下午12:02:46
	 * @ description 
	 * @ reviewed_by
	 */
	public void save(T t) throws Exception;
	/**
	 * 
	 * @ void delete(BaseMapper)
	 * @ author liusq (liusq@tarena.com.cn)
	 * @ date 2012-5-14下午02:47:34
	 * @ description 
	 * @ reviewed_by
	 */
	public void delete(Integer id)throws Exception;
	/**
	 * 
	 * @ void update(BaseMapper)
	 * @ author liusq (liusq@tarena.com.cn)
	 * @ date 2012-5-14下午02:48:15
	 * @ description 
	 * @ reviewed_by
	 */
	public void update(T t)throws Exception;
	
	
}
