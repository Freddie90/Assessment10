package za.ac.cput.Factory.User;


import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.User.Employee;


public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {

        Employee employee = EmployeeFactory.getEmployee(1, "Kyle", "Peterson");
        Assert.assertNotNull(employee);

    }
}