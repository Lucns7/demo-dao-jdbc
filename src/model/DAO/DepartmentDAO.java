package model.DAO;

import java.util.List;

import model.entities.Department;

public interface DepartmentDAO {
	
	void inset(Department obj);
	void update (Department onj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
