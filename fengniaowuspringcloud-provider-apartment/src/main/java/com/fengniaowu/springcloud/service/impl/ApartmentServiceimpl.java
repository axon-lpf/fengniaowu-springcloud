package com.fengniaowu.springcloud.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengniaowu.springcloud.entities.Apartment;
import com.fengniaowu.springcloud.service.ApartmentService;

@Service
public class ApartmentServiceimpl implements ApartmentService {

	@Autowired
    private ApartmentService _apartmentService;
	
	@Override
	public Apartment createAsync(String apartmentId, Apartment createApartment, boolean enabled) {
		// TODO Auto-generated method stub
		return _apartmentService.createAsync(apartmentId, createApartment, enabled);
	}

	@Override
	public void clearCacheAsync(String apartmentId) {
		// TODO Auto-generated method stub
	    _apartmentService.clearCacheAsync(apartmentId);
		
	}

	@Override
	public Apartment getApartmentAsync(String apartmentId) {
		// TODO Auto-generated method stub
		return _apartmentService.getApartmentAsync(apartmentId);
	}

	@Override
	public Apartment updateAsync(String apartmentId, Apartment apartment) {
		// TODO Auto-generated method stub
		return _apartmentService.updateAsync(apartmentId, apartment);
	}

	@Override
	public Apartment apartmentProjectIdAsync(String apartmentId, String projectId) {
		// TODO Auto-generated method stub
		return _apartmentService.apartmentProjectIdAsync(apartmentId, projectId);
	}

	@Override
	public void updateEnabledAsync(String apartmentId, boolean enabled) {
		// TODO Auto-generated method stub
		_apartmentService.updateEnabledAsync(apartmentId, enabled);
	}

	@Override
	public Apartment apartmentConfigAsync(String apartmentId, String companyName, String companyNumber) {
		// TODO Auto-generated method stub
		return _apartmentService.apartmentConfigAsync(apartmentId, companyName, companyNumber);
		
	}

	@Override
	public Apartment removeApartmentConfigAsync(String apartmentId) {
		// TODO Auto-generated method stub
		return _apartmentService.removeApartmentConfigAsync(apartmentId);
	}

	@Override
	public boolean createRoomsAsync(String apartmentId, String beginFloor, String endFloor, int roomCount,
			String decorationType, long retailPrice, long dailyRetailPrice) {
		// TODO Auto-generated method stub
		return _apartmentService.createRoomsAsync(apartmentId, beginFloor, endFloor, roomCount, decorationType, retailPrice, dailyRetailPrice);
	}



}
