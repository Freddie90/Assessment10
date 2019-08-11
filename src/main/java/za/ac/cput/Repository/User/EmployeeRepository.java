package za.ac.cput.Repository.User;

import za.ac.cput.Domain.User.Employee;
import za.ac.cput.Repository.Repository;

import java.util.Set;

public interface EmployeeRepository extends Repository<Employee, Integer> {

    Set<Employee> getAll();

}