package org.example.historialmedicoserver.repository;

import org.example.historialmedicoserver.models.roles.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    public boolean existsByNombre(String name);
}
