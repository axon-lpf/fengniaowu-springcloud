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
import com.fengniaowu.springcloud.service.ApartmentService;


@RestController
public class ApartmentController {

	 @Autowired
	  private ApartmentService _apartmentService;
	 	
	  @Autowired
	  private DiscoveryClient client;  //啓用服務發現
	  
	
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
