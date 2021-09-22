package com.example.cinema.services;

import com.example.cinema.models.Film;
import com.example.cinema.models.Seance;
import com.example.cinema.repositories.FilmRepository;
import com.example.cinema.repositories.SeanceRepository;
import com.example.cinema.services.interfaces.SeanceService;

import java.util.List;

public class SeanceServiceImpl implements SeanceService {

    private SeanceRepository seanceRepository;

    public SeanceServiceImpl(SeanceRepository seanceRepository, FilmRepository filmRepository) {
        this.seanceRepository = seanceRepository;
    }

    @Override
    public List<Seance> findAll() {
        return this.seanceRepository.findAll();
    }

    @Override
    public Seance save(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public Seance findById(String id) {
        return this.seanceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Film> findMovieBySeanceId(String id) {
        return this.findById(id).getFilms();
    }
}
