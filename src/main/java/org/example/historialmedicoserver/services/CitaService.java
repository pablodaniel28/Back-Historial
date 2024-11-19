package org.example.historialmedicoserver.services;

import org.example.historialmedicoserver.models.citas.Cita;
import org.example.historialmedicoserver.models.fichas.Ficha;
import org.example.historialmedicoserver.repository.CitaRepository;
import org.example.historialmedicoserver.repository.FichaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaService {
    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> findAll() {
        return citaRepository.findAll();
    }
    public List<Cita> findAllByPacienteId(long pacienteId) {
        return citaRepository.findAllByPacienteId(pacienteId);
    }
    public Optional<Cita> findById(long id) {
        return citaRepository.findById(id);
    }
    public Cita create(Cita cita) {
        return citaRepository.save(cita);
    }
    public Cita update(Cita cita) {
        return citaRepository.save(cita);
    }
    public void deleteById(long id) {
        citaRepository.deleteById(id);
    }
    public CitaRepository getCitaRepository() {
        return citaRepository;
    }
}
