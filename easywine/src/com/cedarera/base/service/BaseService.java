package com.cedarera.base.service;

import com.cedarera.base.entity.Base;

/**
 * @ file_name BaseService.java
 * @ author liusq (liusq@tarena.com.cn)
 * @ date 2012-5-14下午05:13:58
 * @ description
 * @ reviewed_by 
 */
public interface BaseService<T extends Base> {
 
	/**
	 * 
	 * @ void save(BaseService)
	 * @ author liusq (liusq@tarena.com.cn)
	 * @ date 2012-5-14上午09:26:00
	 * @ description 增加操作
	 * @ reviewed_by
	 */
	public void save(T t)throws Exception;
	/**
	 * 
	 * @ void load(BaseService)
	 * @ author liusq (liusq@tarena.com.cn)
	 * @ date 2012-5-14上午11:12:57
	 * @ description 查找操作
	 * @ reviewed_by
	 */
	public T load(Integer id,Class<T> clazz)throws Exception;
	/**
	 * 
	 * @ void delete(BaseService)
	 * @ author liusq (liusq@tarena.com.cn)
	 * @ date 2012-5-14下午02:42:24
	 * @ description 删除操作
	 * @ reviewed_by
	 */
	public void delete(Integer id, Class<T> clazz)throws Exception;
	/**
	 * 
	 * @ void update(BaseService)
	 * @ author liusq (liusq@tarena.com.cn)
	 * @ date 2012-5-14下午02:42:49
	 * @ description 修改操作
	 * @ reviewed_by
	 */
	public void update(T t)throws Exception;
}
