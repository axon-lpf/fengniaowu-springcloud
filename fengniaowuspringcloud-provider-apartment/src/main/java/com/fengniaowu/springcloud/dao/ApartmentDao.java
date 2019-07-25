package com.fengniaowu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import com.fengniaowu.springcloud.entities.Apartment;

@Mapper
public interface ApartmentDao {

	/**
	 * 获取单个共
	 * 
	 * @param apartmentId 公寓Id
	 * @return 返回公寓
	 */
	public Apartment getApartmentAsync(String apartmentId);

	/**
	 * 获取单个共
	 * 
	 * @param apartmentId 公寓Id
	 * @return 返回公寓
	 */
	public Apartment getApartmentByIdAsync(Long id);

	/**
	 * 根据公寓Id和项目Id获取公寓
	 * 
	 * @param apartmentId
	 * @param projectId
	 * @return
	 */
	public Apartment apartmentProjectIdAsync(@Param("apartmentId") String apartmentId,
			@Param("projectId") String projectId);

	/**
	 * 创建公寓
	 * 
	 * @param apartmentId     公寓Id
	 * @param createApartment 创建公寓实体
	 * @param enabled
	 * @return
	 */
	public Long createAsync(Apartment createApartment);

	/*
	 * 是否启用公寓
	 */
	public int updateEnabledAsync(@Param("apartmentId") String apartmentId, @Param("enabled") boolean enabled);

	/*
	 * 设置公寓配置信息
	 */
	public int setApartmentConfigAsync(@Param("apartmentId")String apartmentId,@Param("companyName")String companyName,@Param("companyNumber") String companyNumber);
	
	/*
	 * 	移除公寓配置信息
	 */
	public int removeApartmentConfigAsync(@Param("apartmentId")String apartmentId);
	/**
	 * 更新公寓
	 * 
	 * @param apartmentId
	 * @param apartment
	 * @return
	 */
	/*
	 * public Apartment updateAsync(Apartment apartment);
	 * 
	 *//**
		 * 根据公寓Id和项目Id获取公寓
		 * 
		 * @param apartmentId
		 * @param projectId
		 * @return
		 */
	/*
	 * public Apartment apartmentProjectIdAsync(@Param("apartmentId") String
	 * apartmentId, @Param("projectId")String projectId);
	 * 
	 *//**
		 * 删除公寓
		 * 
		 * @param apartmentId
		 * @param enabled
		 */
	/*
	 * public void updateEnabledAsync(String apartmentId, boolean enabled);
	 * 
	 *//**
		 * 更新公寓配置
		 * 
		 * @param apartmentId
		 * @param companyName
		 * @param companyNumber
		 * @return
		 */
	/*
	 * public Apartment apartmentConfigAsync(String apartmentId, String companyName,
	 * String companyNumber);
	 * 
	 *//**
		 * 移除公寓配置
		 * 
		 * @param apartmentId
		 * @return
		 *//*
			 * public Apartment removeApartmentConfigAsync(String apartmentId);
			 */

}
