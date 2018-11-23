package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>
{
    @Override
    public Set<Owner> findAll()
    {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner model)
    {
        super.delete(model);
    }

    @Override
    public Owner save(Owner model)
    {
        return super.save(model.getId(), model);
    }

    @Override
    public Owner findById(Long id)
    {
        return super.findById(id);
    }
}