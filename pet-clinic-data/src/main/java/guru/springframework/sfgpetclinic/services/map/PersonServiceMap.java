package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Person;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonServiceMap extends AbstractMapService<Person, Long> implements CrudService<Person, Long>
{
    @Override
    public Set<Person> findAll()
    {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }

    @Override
    public void delete(Person model)
    {
        super.delete(model);
    }

    @Override
    public Person save(Person model)
    {
        return super.save(model.getId(), model);
    }

    @Override
    public Person findById(Long id)
    {
        return super.findById(id);
    }
}
