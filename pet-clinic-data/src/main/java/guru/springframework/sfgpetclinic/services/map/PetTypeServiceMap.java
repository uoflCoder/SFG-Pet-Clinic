package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService
{
    @Override
    public Set<PetType> findAll()
    {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType model)
    {
        super.delete(model);
    }

    @Override
    public PetType save(PetType model)
    {
        return super.save(model);
    }

    @Override
    public PetType findById(Long id)
    {
        return super.findById(id);
    }
}
