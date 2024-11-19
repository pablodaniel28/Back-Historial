package org.example.historialmedicoserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.historialmedicoserver.models.medico.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
