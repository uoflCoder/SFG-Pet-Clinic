package guru.springframework.sfgpetclinic.models;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person
{
    Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties()
    {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties)
    {
        this.specialties = specialties;
    }
}
