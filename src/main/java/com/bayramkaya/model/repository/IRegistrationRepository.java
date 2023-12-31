package com.bayramkaya.model.repository;

import com.bayramkaya.model.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegistrationRepository extends JpaRepository<RegistrationEntity, Integer> {
    RegistrationEntity findByEmail(String email);
    boolean existsByEmail(String email);
}
