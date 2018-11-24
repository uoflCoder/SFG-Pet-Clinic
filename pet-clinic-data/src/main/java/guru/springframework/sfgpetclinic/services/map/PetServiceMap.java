package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService
{
    @Override
    public Set<Pet> findAll()
    {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet model)
    {
        super.delete(model);
    }

    @Override
    public Pet save(Pet model)
    {
        return super.save(model.getId(), model);
    }

    @Override
    public Pet findById(Long id)
    {
        return super.findById(id);
    }
}
