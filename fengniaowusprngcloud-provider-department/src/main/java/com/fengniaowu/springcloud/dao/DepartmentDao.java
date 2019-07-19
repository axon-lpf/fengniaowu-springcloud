package com.fengniaowu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fengniaowu.springcloud.entities.Department;

@Mapper
public interface DepartmentDao {

	public boolean addDept(Department dept);

	public Department findById(Long id);

	public List<Department> findAll();
}
