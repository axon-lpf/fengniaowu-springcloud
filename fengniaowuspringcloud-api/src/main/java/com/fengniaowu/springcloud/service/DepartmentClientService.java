package com.fengniaowu.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fengniaowu.springcloud.entities.Department;
import com.fengniaowu.springcloud.fallbackfactory.DepartmentClientServiceFallbackFatory;

@FeignClient(value = "FENGNIAOWUSPRINGCLOUD",fallbackFactory=DepartmentClientServiceFallbackFatory.class)
public interface DepartmentClientService {

	@RequestMapping(value = "/department/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable("id") long id);

	@RequestMapping(value = "/department/list", method = RequestMethod.GET)
	public List<Department> list();

	@RequestMapping(value = "/department/add",method = RequestMethod.POST)
	public boolean add(Department dept);

}
