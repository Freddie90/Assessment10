package za.ac.cput.Service.User;

import za.ac.cput.Domain.User.Employee;
import za.ac.cput.Repository.User.EmployeeRepository;
import za.ac.cput.Repository.User.impl.EmployeeRepositoryImpl;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {


    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    public EmployeeServiceImpl() {
        repository = EmployeeRepositoryImpl.getEmployeeRepository();
    }

    public static EmployeeServiceImpl getService(){

        if(service == null){
            return new EmployeeServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return repository.create(employee);
    }

    @Override
    public Employee read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.update(employee);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}