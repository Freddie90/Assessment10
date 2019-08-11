package za.ac.cput.Service.Demography;

import za.ac.cput.Domain.Demography.Race;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, Integer> {

    Set<Race> getAll();

}
