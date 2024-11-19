package org.example.historialmedicoserver.repository;

import org.example.historialmedicoserver.models.fichas.Ficha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FichaRepository extends JpaRepository<Ficha, Long> {
    List<Ficha> findAllByHorarioEspecialidadId(long horarioEspecialidadId);
    List<Ficha> findAllByEstadoTrue();
}
