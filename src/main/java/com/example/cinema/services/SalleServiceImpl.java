package com.example.cinema.services;

import com.example.cinema.models.Salle;
import com.example.cinema.models.Seance;
import com.example.cinema.repositories.FilmRepository;
import com.example.cinema.repositories.SalleRepository;
import com.example.cinema.repositories.SeanceRepository;
import com.example.cinema.services.interfaces.SalleService;

import java.util.List;

public class SalleServiceImpl implements SalleService {

    private SalleRepository salleRepository;

    public SalleServiceImpl(SalleRepository salleRepository, SeanceRepository seanceRepository, FilmRepository filmRepository) {
        this.salleRepository = salleRepository;
    }

    @Override
    public List<Salle> findAll() {
        return this.salleRepository.findAll();
    }

    @Override
    public Salle save(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public Salle findById(String id) {
        return this.salleRepository.findById(id).orElse(null);
    }

    @Override
    public List<Seance> findSeanceBySalleId(String id) {
        return this.findById(id).getSeances();
    }

    @Override
    public void delete(String id) {
        this.salleRepository.deleteById(id);
    }
    @Override
    public Salle putSalle(Salle salle) {
        return this.salleRepository.save(salle);
    }
}
