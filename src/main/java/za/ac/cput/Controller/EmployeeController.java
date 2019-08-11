package za.ac.cput.Controller;

import za.ac.cput.Domain.Demography.Gender;
import za.ac.cput.Domain.Demography.Race;
import za.ac.cput.Domain.User.Employee;
import za.ac.cput.Domain.User.EmployeeGender;
import za.ac.cput.Factory.Demography.GenderFactory;
import za.ac.cput.Factory.Demography.RaceFactory;
import za.ac.cput.Factory.User.EmployeeFactory;
import za.ac.cput.Factory.User.EmployeeGenderFactory;
import za.ac.cput.Service.Demography.GenderService;
import za.ac.cput.Service.Demography.RaceService;
import za.ac.cput.Service.Demography.impl.GenderServiceImpl;
import za.ac.cput.Service.Demography.impl.RaceServiceImpl;
import za.ac.cput.Service.User.EmployeeGenderService;
import za.ac.cput.Service.User.EmployeeService;
import za.ac.cput.Service.User.EmployeeGenderServiceImpl;
import za.ac.cput.Service.User.EmployeeServiceImpl;

public class EmployeeController {
    private EmployeeService employeeService = EmployeeServiceImpl.getService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getService();
    private RaceService raceService = RaceServiceImpl.getService();
    private GenderService genderService = GenderServiceImpl.getService();

    public void create(int empId, String firstName, String lastName, int genderId, int raceId){

        Employee employee = EmployeeFactory.getEmployee(empId, firstName, lastName);
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(empId, genderId);
        employeeGenderService.create(employeeGender);

        Race race = RaceFactory.buildRace(raceId, "Persons race");
        raceService.create(race);

        Gender gender = GenderFactory.buildGender(genderId, "Male or Female");
        genderService.create(gender);


    }


}