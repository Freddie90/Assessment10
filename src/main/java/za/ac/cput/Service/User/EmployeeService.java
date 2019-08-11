package za.ac.cput.Service.User;

import za.ac.cput.Domain.User.Employee;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, Integer> {

    Set<Employee> getAll();

}
