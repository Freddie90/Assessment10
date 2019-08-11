package za.ac.cput.Factory.Demography;

import za.ac.cput.Domain.Demography.Gender;

public class GenderFactory {

    public static Gender buildGender(int genderId, String gender)
    {
        return new Gender.Builder()
                .id(genderId)
                .desc(gender)
                .build();

    }
}
