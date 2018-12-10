package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Specialty;
import guru.springframework.sfgpetclinic.models.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService
{

    private final SpecialtyService specialtyService;

    @Autowired
    public VetServiceMap(SpecialtyService specialtyService)
    {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll()
    {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet model)
    {
        super.delete(model);
    }

    @Override
    public Vet save(Vet model)
    {
        if(model.getSpecialties().size() > 0)
        {
            model.getSpecialties().forEach(specialty -> {

                if(specialty.getId() == null)
                {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
        });
        }
        return super.save(model);
    }

    @Override
    public Vet findById(Long id)
    {
        return super.findById(id);
    }
}
