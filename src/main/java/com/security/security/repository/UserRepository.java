package com.security.security.repository;

import com.security.security.entity.PetOwner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<PetOwner,Long> {
    PetOwner findByUsername(final String username);
}
