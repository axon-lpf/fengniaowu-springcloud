package com.fengniaowu.springcloud.service;

import com.fengniaowu.springcloud.entities.Apartment;


public interface ApartmentService {


    /**
     * 获取单个共
     * @param apartmentId  公寓Id
     * @return  返回公寓
     */
   public Apartment getApartmentAsync(String apartmentId);
   
   /**
    * 获取单个共
    * @param apartmentId  公寓Id
    * @return  返回公寓
    */
  public Apartment getApartmentByIdAsync(Long id);
  
   
   /**
   *  根据公寓Id和项目Id获取公寓
   * @param apartmentId
   * @param projectId
   * @return
   */
   public Apartment apartmentProjectIdAsync(String apartmentId, String projectId);
   
   
   /**
	 * 创建公寓
	 * @param apartmentId  公寓Id
	 * @param createApartment 创建公寓实体
	 * @param enabled
	 * @return
	 */
   	public  Long createAsync(Apartment createApartment);
   	
   	
   	/**
   	 * 是否启用公寓
   	 * @param apartmentId
   	 * @param enabled
   	 * @return
   	 */
	public int updateEnabledAsync(String apartmentId, boolean enabled);
	
	
	/**
	 * 设置公寓配置信
	 * @param apartmentId
	 * @param companyName
	 * @param companyNumber
	 * @return
	 */
	public int setApartmentConfigAsync(String apartmentId, String companyName, String companyNumber);

	/**
	 * 移除公寓配置信息
	 * @param apartmentId
	 * @return
	 */
	public int removeApartmentConfigAsync(String apartmentId);
/*	*//**
	 * 创建公寓
	 * @param apartmentId  公寓Id
	 * @param createApartment 创建公寓实体
	 * @param enabled
	 * @return
	 *//*
   public  Apartment createAsync(Apartment createApartment);*/



   /* *//**
     *   更新公寓
     * @param apartmentId
     * @param apartment
     * @return
     *//*
   public Apartment updateAsync(Apartment apartment);



    *//**
     *  删除公寓
     * @param apartmentId
     * @param enabled
     *//*
   public void updateEnabledAsync(String apartmentId, boolean enabled);

    *//**
     * 更新公寓配置
     * @param apartmentId
     * @param companyName
     * @param companyNumber
     * @return
     *//*
   public Apartment apartmentConfigAsync(String apartmentId, String companyName, String companyNumber);

    *//**
     *  移除公寓配置
     * @param apartmentId
     * @return
     *//*
   public Apartment removeApartmentConfigAsync(String apartmentId);
*/
}
