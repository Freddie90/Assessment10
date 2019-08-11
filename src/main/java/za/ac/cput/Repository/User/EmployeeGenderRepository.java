package za.ac.cput.Repository.User;


import za.ac.cput.Domain.User.EmployeeGender;
import za.ac.cput.Repository.Repository;

import java.util.Set;

public interface EmployeeGenderRepository extends Repository<EmployeeGender, Integer> {

    Set<EmployeeGender> getAll();

}