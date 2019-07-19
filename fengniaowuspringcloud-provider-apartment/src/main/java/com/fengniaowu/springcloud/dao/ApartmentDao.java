package com.fengniaowu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import com.fengniaowu.springcloud.entities.Apartment;

@Mapper
public interface ApartmentDao {

	/**
	 * 创建公寓
	 * @param apartmentId  公寓Id
	 * @param createApartment 创建公寓实体
	 * @param enabled
	 * @return
	 */
   public  Apartment createAsync(String apartmentId, Apartment createApartment, boolean enabled);

    /**
      * 清除缓存
     */
   public void clearCacheAsync(String apartmentId);

    /**
     * 获取单个共
     * @param apartmentId  公寓Id
     * @return  返回公寓
     */
   public Apartment getApartmentAsync(String apartmentId);

    /**
     *   更新公寓
     * @param apartmentId
     * @param apartment
     * @return
     */
   public Apartment updateAsync(String apartmentId, Apartment apartment);

    /**
     *  根据公寓Id和项目Id获取公寓
     * @param apartmentId
     * @param projectId
     * @return
     */
   public Apartment apartmentProjectIdAsync(String apartmentId, String projectId);

    /**
     *  删除公寓
     * @param apartmentId
     * @param enabled
     */
   public void updateEnabledAsync(String apartmentId, boolean enabled);

    /**
     * 更新公寓配置
     * @param apartmentId
     * @param companyName
     * @param companyNumber
     * @return
     */
   public Apartment apartmentConfigAsync(String apartmentId, String companyName, String companyNumber);

    /**
     *  移除公寓配置
     * @param apartmentId
     * @return
     */
   public Apartment removeApartmentConfigAsync(String apartmentId);

    /**
     * 创建公寓房间
     * @param apartmentId
     * @param beginFloor
     * @param endFloor
     * @param roomCount
     * @param decorationType
     * @param retailPrice
     * @param dailyRetailPrice
     * @return
     */
   public boolean createRoomsAsync(String apartmentId, String beginFloor, String endFloor, int roomCount, String decorationType, long retailPrice, long dailyRetailPrice);
}
