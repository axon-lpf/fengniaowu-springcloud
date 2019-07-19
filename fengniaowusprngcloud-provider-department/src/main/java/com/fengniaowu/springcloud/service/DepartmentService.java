package com.fengniaowu.springcloud.service;

import java.util.List;

import com.fengniaowu.springcloud.entities.Department;

public interface DepartmentService {

	public boolean add(Department dept);

	public Department get(Long id);

	public List<Department> list();
}
