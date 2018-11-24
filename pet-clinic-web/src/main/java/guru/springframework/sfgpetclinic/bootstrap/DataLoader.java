package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.models.Owner;
import guru.springframework.sfgpetclinic.models.Person;
import guru.springframework.sfgpetclinic.models.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader()
    {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception
    {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("McClure");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ryan");
        owner2.setLastName("Cornett");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Mark");
        vet1.setLastName("Cornett");


        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Chase");
        vet2.setLastName("Cunningham");


        ownerService.save(owner1);
        ownerService.save(owner2);
        vetService.save(vet1);
        vetService.save(vet2);
    }
}
