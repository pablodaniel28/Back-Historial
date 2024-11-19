package org.example.historialmedicoserver.services;

import org.example.historialmedicoserver.models.fichas.Ficha;
import org.example.historialmedicoserver.repository.FichaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FichaService {

    @Autowired
    private FichaRepository fichaRepository;

    public FichaService(FichaRepository fichaRepository) {
        this.fichaRepository = fichaRepository;
    }
    public List<Ficha> findAllById(long horarioEspecialidadId ) {
        return fichaRepository.findAllByHorarioEspecialidadId(horarioEspecialidadId );
    } public List<Ficha> findAll() {
        return fichaRepository.findAll();
    }
    public List<Ficha> findAllSuspendidos() {
        return fichaRepository.findAllByEstadoTrue();
    }
    public Optional<Ficha> findById(long id) {
        return fichaRepository.findById(id);
    }
    public Ficha create(Ficha ficha) {
        return fichaRepository.save(ficha);
    }
    public Ficha update(Ficha ficha) {
        return fichaRepository.save(ficha);
    }
    public void deleteById(long id) {
        fichaRepository.deleteById(id);
    }
    public FichaRepository getFichaRepository() {
        return fichaRepository;
    }
}
