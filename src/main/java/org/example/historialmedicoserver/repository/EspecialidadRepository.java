package org.example.historialmedicoserver.repository;

import org.example.historialmedicoserver.models.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Long> {
}