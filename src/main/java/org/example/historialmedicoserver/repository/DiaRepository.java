package org.example.historialmedicoserver.repository;

import org.example.historialmedicoserver.models.Dia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaRepository  extends JpaRepository<Dia, Long> {
}
