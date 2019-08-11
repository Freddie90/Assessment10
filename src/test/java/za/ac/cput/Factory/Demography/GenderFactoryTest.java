package za.ac.cput.Factory.Demography;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Demography.Gender;

public class GenderFactoryTest {

    @Test
    public void getGender() {

        Gender gender = GenderFactory.buildGender(1, "M");
        Assert.assertNotNull(gender);

    }
}
