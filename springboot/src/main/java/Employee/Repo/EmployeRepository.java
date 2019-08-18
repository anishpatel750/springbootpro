package Employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Long> {

	Employee findOne(Long empid);

}
