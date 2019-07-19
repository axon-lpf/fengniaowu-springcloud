package com.fengniaowu.springcloud.fallbackfactory;


import java.util.List;

import org.springframework.stereotype.Component;

import com.fengniaowu.springcloud.entities.Department;
import com.fengniaowu.springcloud.service.DepartmentClientService;

import feign.hystrix.FallbackFactory;

@Component
public class DepartmentClientServiceFallbackFatory implements FallbackFactory<DepartmentClientService>{

	
	public DepartmentClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new DepartmentClientService() {
			
			public List<Department> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Department get(long id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public boolean add(Department dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
