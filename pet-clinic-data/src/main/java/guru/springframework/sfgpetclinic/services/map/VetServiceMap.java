package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Vet;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>
{
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
        return super.save(model.getId(), model);
    }

    @Override
    public Vet findById(Long id)
    {
        return super.findById(id);
    }
}
