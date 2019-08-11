package za.ac.cput.Factory.Demography;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Demography.Race;

public class RaceFactoryTest {

    @Test
    public void buildRace() {

        Race race = RaceFactory.buildRace(1, "Colored");
        Assert.assertNotNull(race);


    }
}