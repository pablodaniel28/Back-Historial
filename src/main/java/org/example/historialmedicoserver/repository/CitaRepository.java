package org.example.historialmedicoserver.repository;

import org.example.historialmedicoserver.models.citas.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitaRepository extends JpaRepository<Cita, Long> {
    public List<Cita> findAllByPacienteId(long pacienteId);
}
