package za.ac.cput.Repository.Demography;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import za.ac.cput.Domain.Demography.Gender;
import za.ac.cput.Factory.Demography.GenderFactory;
import za.ac.cput.Repository.Demography.impl.GenderRepositoryImpl;

import java.util.Set;

public class GenderRepositoryImplTest {

    private GenderRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getGenderRepository();
    }


    @Test
    public void getAll() {

        Set<Gender> employeeSet = repository.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Gender employee = GenderFactory.buildGender(1, "M");

        repository.create(employee);

        Gender inRepo = repository.read(employee.getId());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Gender employee = GenderFactory.buildGender(1, "M");

        repository.create(employee);

        Gender inRepo = repository.read(employee.getId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Gender employee = GenderFactory.buildGender(1, "M");

        repository.create(employee);
        Gender inRepo = repository.read(employee.getId());

        employee.setDesc("This is a Male");

        repository.update(employee);

        Assert.assertEquals(employee.getDesc(), inRepo.getDesc());

    }

    @Test
    public void delete() {

        Gender employee = GenderFactory.buildGender(1, "M");

        repository.create(employee);

        Gender inRepo = repository.read(employee.getId());

        Assert.assertNotNull(inRepo);

        repository.delete(employee.getId());

        Gender deleted = repository.read(employee.getId());

        Assert.assertNull(deleted);

    }
}