package za.ac.cput.Repository.Demography;

import za.ac.cput.Domain.Demography.Race;
import za.ac.cput.Repository.Repository;

import java.util.Set;

public interface RaceRepository extends Repository<Race, Integer> {

    Set<Race> getAll();

}