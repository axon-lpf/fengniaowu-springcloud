package com.fengniaowu.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengniaowu.springcloud.dao.ApartmentDao;
import com.fengniaowu.springcloud.entities.Apartment;
import com.fengniaowu.springcloud.service.ApartmentService;

@Service
public class ApartmentServiceimpl implements ApartmentService {

	@Autowired
	private ApartmentDao _apartmentDao;

	@Override
	public Apartment getApartmentAsync(String apartmentId) {
		// TODO Auto-generated method stub
		return _apartmentDao.getApartmentAsync(apartmentId);
	}

	@Override
	public Apartment getApartmentByIdAsync(Long id) {
		// TODO Auto-generated method stub
		return _apartmentDao.getApartmentByIdAsync(id);
	}

	@Override
	public Apartment apartmentProjectIdAsync(String apartmentId, String projectId) {
		// TODO Auto-generated method stub
		return _apartmentDao.apartmentProjectIdAsync(apartmentId, projectId);
	}

	@Override
	public Long createAsync(Apartment createApartment) {
		// TODO Auto-generated method stub
		return _apartmentDao.createAsync(createApartment);
	}

	@Override
	public int updateEnabledAsync(String apartmentId, boolean enabled) {
		// TODO Auto-generated method stub
		return _apartmentDao.updateEnabledAsync(apartmentId, enabled);
	}

	@Override
	public int setApartmentConfigAsync(String apartmentId, String companyName, String companyNumber) {
																																								// method stub
		return _apartmentDao.setApartmentConfigAsync(apartmentId, companyName, companyNumber);

	}

	@Override
	public int removeApartmentConfigAsync(String apartmentId) {
		// TODO Auto-generated method stub return
		return _apartmentDao.removeApartmentConfigAsync(apartmentId);
	}

	/*
	 * @Override public void clearCacheAsync(String apartmentId) { // TODO
	 * Auto-generated method stub _apartmentDao.clearCacheAsync(apartmentId);
	 * 
	 * }
	 */

	/*
	 * @Override public Apartment updateAsync(Apartment apartment) { // TODO
	 * Auto-generated method stub return _apartmentDao.updateAsync(apartment); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @Override public Apartment apartmentConfigAsync(String apartmentId, String
	 * companyName, String companyNumber) { // TODO Auto-generated method stub
	 * return _apartmentDao.apartmentConfigAsync(apartmentId, companyName,
	 * companyNumber);
	 * 
	 * }
	 * 
	 * @Override public Apartment removeApartmentConfigAsync(String apartmentId) {
	 * // TODO Auto-generated method stub return
	 * _apartmentDao.removeApartmentConfigAsync(apartmentId); }
	 * 
	 * @Override public boolean createRoomsAsync(String apartmentId, String
	 * beginFloor, String endFloor, int roomCount, String decorationType, long
	 * retailPrice, long dailyRetailPrice) { // TODO Auto-generated method stub
	 * return _apartmentDao.createRoomsAsync(apartmentId, beginFloor, endFloor,
	 * roomCount, decorationType, retailPrice, dailyRetailPrice); }
	 */

}
