package guru.springframework.sfgpetclinic.services;


import guru.springframework.sfgpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService
{
    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findall();
}