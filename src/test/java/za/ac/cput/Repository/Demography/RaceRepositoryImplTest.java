package za.ac.cput.Repository.Demography;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import za.ac.cput.Domain.Demography.Race;
import za.ac.cput.Factory.Demography.RaceFactory;
import za.ac.cput.Repository.Demography.impl.RaceRepositoryImpl;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {

    private RaceRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRaceRepository();
    }


    @Test
    public void getAll() {

        Set<Race> employeeSet = repository.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Race employee = RaceFactory.buildRace(1,"Colored");

        repository.create(employee);

        Race inRepo = repository.read(employee.getRaceID());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Race employee = RaceFactory.buildRace(1,"Colored");

        repository.create(employee);

        Race inRepo = repository.read(employee.getRaceID());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Race employee = RaceFactory.buildRace(1,"Colored");

        repository.create(employee);
        Race inRepo = repository.read(employee.getRaceID());

        employee.setDesc("NULL");

        repository.update(employee);

        Assert.assertEquals(employee.getRaceID(), inRepo.getRaceID());

    }

    @Test
    public void delete() {

        Race employee = RaceFactory.buildRace(1,"Colored");

        repository.create(employee);

        Race inRepo = repository.read(employee.getRaceID());

        Assert.assertNotNull(inRepo);

        repository.delete(employee.getRaceID());

        Race deleted = repository.read(employee.getRaceID());

        Assert.assertNull(deleted);

    }
}