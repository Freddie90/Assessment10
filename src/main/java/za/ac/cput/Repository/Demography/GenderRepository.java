package za.ac.cput.Repository.Demography;

import za.ac.cput.Domain.Demography.Gender;
import za.ac.cput.Repository.Repository;

import java.util.Set;

public interface GenderRepository extends Repository<Gender, Integer> {

    Set<Gender> getAll();

}