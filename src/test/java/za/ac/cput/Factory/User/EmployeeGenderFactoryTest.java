package za.ac.cput.Factory.User;


import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.User.EmployeeGender;

public class EmployeeGenderFactoryTest {

    @Test
    public void buildEmployeeGender() {

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(1, 1);
        Assert.assertNotNull(employeeGender);

    }

}