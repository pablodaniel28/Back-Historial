package org.example.historialmedicoserver.repository;

import org.example.historialmedicoserver.models.pacientes.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
