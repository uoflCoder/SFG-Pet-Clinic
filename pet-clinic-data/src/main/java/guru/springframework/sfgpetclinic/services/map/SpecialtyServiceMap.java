package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Specialty;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService
{
    @Override
    public Set<Specialty> findAll()
    {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty model)
    {
        super.delete(model);
    }

    @Override
    public Specialty save(Specialty model)
    {
        return super.save(model);
    }

    @Override
    public Specialty findById(Long id)
    {
        return super.findById(id);
    }
}
