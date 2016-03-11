package com.coolbreeze.oa.base;

import java.util.List;

public interface BaseDao<T> {

	/*
	 * 保存
	 */
	void save(T entity);

	/*
	 * 删除
	 */
	void delete(Long id);

	/*
	 * 更新
	 */
	void update(T entity);


	/*
	 * 获取
	 */
	T getById(Long id);


	/*
	 * 获取多个
	 */
	List<T> getByIds(Long[] ids);

	/*
	 * 获取所有
	 */
	List<T> findAll();
}
