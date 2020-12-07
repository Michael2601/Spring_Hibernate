package by.spring.hibernate.bsac.service;

import java.util.List;

import by.spring.hibernate.bsac.exception.RecordNotFoundException;
import by.spring.hibernate.bsac.model.EmployeeEntity;

public interface EmployeeService {
	public List<EmployeeEntity> getAllEmployees();
	public EmployeeEntity getEmployeeById(Long id) throws RecordNotFoundException;
	public EmployeeEntity createOrUpdateEmployee(EmployeeEntity entity);
	public void deleteEmployeeById(Long id) throws RecordNotFoundException;
}
