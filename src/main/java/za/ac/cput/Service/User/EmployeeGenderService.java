package za.ac.cput.Service.User;


import za.ac.cput.Domain.User.EmployeeGender;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, Integer> {

    Set<EmployeeGender> getAll();
}
