package com.fengniaowu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fengniaowu.springcloud.entities.Department;
import com.fengniaowu.springcloud.service.DepartmentClientService;

@RestController
public class DepartmentContrlloer {

	@Autowired
	private DepartmentClientService departmentClientService;
	
	  @RequestMapping(value="/department/add",method=RequestMethod.POST)
	  public boolean add(@RequestBody Department Department)
	  {
	   return departmentClientService.add(Department);
	  }
	  
	  @RequestMapping(value="/department/get/{id}",method=RequestMethod.GET)
	  public Department get(@PathVariable("id") Long id)
	  {
		  return departmentClientService.get(id);
	  }
	  
	  @RequestMapping(value="/department/list",method=RequestMethod.GET)
	  public List<Department> list()
	  {
		  return departmentClientService.list();
	  }
	  
}
