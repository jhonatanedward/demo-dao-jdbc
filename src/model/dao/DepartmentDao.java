package model.dao;

import java.util.List;

import model.entites.Department;

public interface DepartmentDao {

	void insert(Department obj);

	void Delete(Department obj);

	void deleteById(Integer id);

	Department findById(Integer id);

	List<Department> findAll();
}