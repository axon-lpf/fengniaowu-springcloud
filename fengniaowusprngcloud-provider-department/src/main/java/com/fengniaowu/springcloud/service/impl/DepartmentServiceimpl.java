package com.fengniaowu.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengniaowu.springcloud.dao.DepartmentDao;
import com.fengniaowu.springcloud.entities.Department;
import com.fengniaowu.springcloud.service.DepartmentService;

@Service
public class DepartmentServiceimpl implements DepartmentService {

	@Autowired
	private DepartmentDao dao;
	
	@Override
	public boolean add(Department dept) {
		// TODO Auto-generated method stub
		return dao.addDept(dept);
	}

	@Override
	public Department get(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Department> list() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
