package com.fengniaowu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fengniaowu.springcloud.entities.Department;
import com.fengniaowu.springcloud.service.DepartmentService;


@RestController
public class DepartmentController {

	 @Autowired
	  private DepartmentService departmentService;
	 	
	  @Autowired
	  private DiscoveryClient client;  //啓用服務發現
	  
	  @RequestMapping(value="/department/add",method=RequestMethod.POST)
	  public boolean add(@RequestBody Department Department)
	  {
	   return departmentService.add(Department);
	  }
	  
	  @RequestMapping(value="/department/get/{id}",method=RequestMethod.GET)
	  public Department get(@PathVariable("id") Long id)
	  {
		  return departmentService.get(id);
	  }
	  
	  @RequestMapping(value="/department/list",method=RequestMethod.GET)
	  public List<Department> list()
	  {
		  return departmentService.list();
	  }
	  
	  @RequestMapping(value = "/department/discovery", method = RequestMethod.GET)
	  public Object discovery()
	  {
	    List<String> list = client.getServices();
	    System.out.println("**********" + list);

	    List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-Department");
	    for (ServiceInstance element : srvList) {
	     System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
	         + element.getUri());
	    }
	    return this.client;
	  }
}
