package com.nvvtoan.springbe.repository;


import java.util.Optional;

import com.nvvtoan.springbe.models.ERole;
import com.nvvtoan.springbe.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}