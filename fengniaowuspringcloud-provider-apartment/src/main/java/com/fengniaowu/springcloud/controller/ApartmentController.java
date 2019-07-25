package com.fengniaowu.springcloud.controller;

import java.util.Date;
import java.util.UUID;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fengniaowu.springcloud.entities.Apartment;
import com.fengniaowu.springcloud.response.ResponseBody;
import com.fengniaowu.springcloud.service.ApartmentService;

import io.swagger.annotations.Api;

@Api(value = "公寓信息", produces = "application/json")
@RestController
@RequestMapping("/apartment")
public class ApartmentController {

	@Autowired
	private ApartmentService _apartmentService;

	/*
	 * 获取单个公寓详情
	 */
	@RequestMapping(value = "/getApartment/{id}", method = RequestMethod.GET)
	public ResponseBody getApartment(@PathVariable("id") String id) {

		ResponseBody responseBody = new ResponseBody(_apartmentService.getApartmentAsync(id));

		return responseBody;
	}

	/*
	 * 根据公寓Id和项目Id获取公寓详情
	 */
	@RequestMapping(value = "/getApartmentProjectId/{apartmentId}/{projectId}", method = RequestMethod.GET)
	public ResponseBody getApartmentProjectId(@PathVariable("apartmentId") String apartmentId,
			@PathVariable("projectId") String projectId) {

		ResponseBody responseBody = new ResponseBody(_apartmentService.apartmentProjectIdAsync(apartmentId, projectId));

		return responseBody;

	}

	/*
	 * 创建公寓信息
	 */
	@RequestMapping(value = "/createApartment", method = RequestMethod.POST)
	public ResponseBody createApartment(@RequestBody Apartment apartment) {

		String guid = UUID.randomUUID().toString();
		apartment.ActorId = guid;
		apartment.ApartmentId = guid.replace("-", "").toUpperCase();
		apartment.CreateTime = new Date();
		apartment.UpdateTime = new Date();
		apartment.Enabled = true;

		long count = _apartmentService.createAsync(apartment);

		ResponseBody responseBody = new ResponseBody(-1, "添加失败");
		if (count > 0) {

			responseBody = new ResponseBody(_apartmentService.getApartmentByIdAsync(apartment.Id));
		}

		return responseBody;
	}

	/*
	 * 是否启用公寓
	 */
	@RequestMapping(value = "/updateEnabled/{apartmentId}/{enabled}", method = RequestMethod.GET)
	public ResponseBody updateEnabled(@PathVariable("apartmentId") String apartmentId,
			@PathVariable("enabled") Boolean enabled) {

		int count = _apartmentService.updateEnabledAsync(apartmentId, enabled);

		ResponseBody responseBody = new ResponseBody(-1, "添加失败");

		if (count > 0) {

			responseBody = new ResponseBody(1, "更新成功");
		}
		return responseBody;
	}

	@RequestMapping(value = "/removeApartmentConfig/{apartmentId}", method = RequestMethod.GET)
	public ResponseBody removeApartmentConfig(@PathVariable("apartmentId") String apartmentId) {

		ResponseBody responseBody = new ResponseBody(-1, "移除失败");
		int count = _apartmentService.removeApartmentConfigAsync(apartmentId);

		if (count > 0) {

			responseBody = new ResponseBody(_apartmentService.getApartmentAsync(apartmentId));
		}

		return responseBody;
	}

	@RequestMapping(value = "/updateApartmentConfigAsync/{apartmentId}/{companyName}/{companyNumber}", method = RequestMethod.GET)
	public ResponseBody updateApartmentConfig(@PathVariable("apartmentId") String apartmentId,
			@PathVariable("companyName") String companyName, @PathVariable("companyNumber") String companyNumber) {

		ResponseBody responseBody = new ResponseBody(-1, "设置失败");
		int count = _apartmentService.setApartmentConfigAsync(apartmentId, companyName, companyNumber);
		if (count > 0) {
			responseBody = new ResponseBody(_apartmentService.getApartmentAsync(apartmentId));
		}

		return responseBody;
	}

}
