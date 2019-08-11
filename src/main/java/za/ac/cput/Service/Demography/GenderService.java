package za.ac.cput.Service.Demography;

import za.ac.cput.Domain.Demography.Gender;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, Integer> {

    Set<Gender> getAll();

}
