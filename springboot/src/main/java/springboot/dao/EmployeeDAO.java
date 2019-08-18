package springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Repo.EmployeRepository;
import springboot.Employee;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeRepository employeeRepository;
	
	/*Save an Employee with emp id */
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
		
	}

	/*List all the employees */
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	/*Find employee with id*/
	public Employee findOne(Long empid) {
		return employeeRepository.findOne(empid);
	}
	
	/* Delete an employee with emp id*/
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
	
}
