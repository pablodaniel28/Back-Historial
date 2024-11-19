package org.example.historialmedicoserver.repository;

import org.example.historialmedicoserver.models.horarios.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long> {
}
