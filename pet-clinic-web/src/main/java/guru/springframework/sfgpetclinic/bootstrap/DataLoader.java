package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.models.*;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner
{
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService)
    {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }



    @Override
    public void run(String... args) throws Exception
    {
        int count = petTypeService.findAll().size();

        if(count == 0)
        {
            loadData();
        }
    }

    private void loadData()
    {
        Specialty specialty1 = new Specialty();
        specialty1.setDescription("radiology");

        Specialty specialty2 = new Specialty();
        specialty2.setDescription("surgery");

        Specialty specialty3 = new Specialty();
        specialty3.setDescription("dentistry");


        Specialty savedSpecialty1;
        Specialty savedSpecialty2;
        Specialty savedSpecialty3;

        savedSpecialty1 = specialtyService.save(specialty1);
        savedSpecialty2 = specialtyService.save(specialty2);
        savedSpecialty3 = specialtyService.save(specialty3);

        PetType petType1 = new PetType();
        petType1.setName("Dog");

        PetType petType2 = new PetType();
        petType2.setName("Squirrel");

        Pet pet1 = new Pet();
        Pet pet2 = new Pet();


        PetType savedPetType1 = petTypeService.save(petType1);
        PetType savedPetType2 = petTypeService.save(petType2);

        Owner owner1 = new Owner();
        //owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("McClure");
        owner1.setAddress("583 Beach Drive");
        owner1.setCity("Long Beach");
        owner1.setPhoneNumber("502-323-4250");
        owner1.getPets().add(pet1);


        Owner owner2 = new Owner();
        //owner2.setId(2L);
        owner2.setFirstName("Ryan");
        owner2.setLastName("Cornett");
        owner2.setAddress("1803 Douglass Boulevard");
        owner2.setCity("Louisville");
        owner2.setPhoneNumber("502-322-4370");
        owner2.getPets().add(pet2);


        Vet vet1 = new Vet();
        //vet1.setId(1L);
        vet1.setFirstName("Mark");
        vet1.setLastName("Cornett");
        vet1.getSpecialties().add(savedSpecialty1);


        Vet vet2 = new Vet();
        //vet2.setId(2L);
        vet2.setFirstName("Chase");
        vet2.setLastName("Cunningham");
        vet2.getSpecialties().add(savedSpecialty2);
        vet2.getSpecialties().add(savedSpecialty3);

        pet1.setName("Sam");
        pet1.setPetType(savedPetType1);
        pet1.setOwner(owner1);
        pet1.setBirthDate(LocalDate.now().minusDays(5));

        pet2.setName("Squirrley");
        pet2.setPetType(savedPetType2);
        pet2.setOwner(owner2);
        pet2.setBirthDate(LocalDate.now());

        ownerService.save(owner1);
        ownerService.save(owner2);
        vetService.save(vet1);
        vetService.save(vet2);
    }
}
