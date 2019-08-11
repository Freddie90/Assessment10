package za.ac.cput.Factory.User;

import za.ac.cput.Domain.User.EmployeeGender;

public class EmployeeGenderFactory {
    public static EmployeeGender buildEmployeeGender(int empId, int genderId){

        return new EmployeeGender().
                employeeGender(genderId, empId);
    }
}
