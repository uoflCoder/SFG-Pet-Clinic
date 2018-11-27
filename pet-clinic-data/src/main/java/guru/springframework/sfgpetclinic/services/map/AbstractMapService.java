package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long>
{
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll()
    {
        return new HashSet<>(map.values());
    }

    T findById(ID id)
    {
        return map.get(id);
    }

    T save(T model)
    {
        if (model != null)
        {
            if (model.getId() == null)
            {
                model.setId(getNextId());
            }
            map.put(model.getId(), model);
        } else
        {
            throw new RuntimeException("Object cannot be null");
        }


        return model;
    }

    void deleteById(ID id)
    {
        map.remove(id);
    }

    void delete(T model)
    {
        map.entrySet().removeIf(entry -> entry.getValue().equals(model));
    }

    private Long getNextId()
    {
        return map.keySet().isEmpty() ? 1 : Collections.max(map.keySet()) + 1;
    }
}
