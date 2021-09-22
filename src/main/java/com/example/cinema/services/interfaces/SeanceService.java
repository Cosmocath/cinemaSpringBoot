package com.example.cinema.services.interfaces;

import com.example.cinema.models.Film;
import com.example.cinema.models.Salle;
import com.example.cinema.models.Seance;

import java.util.List;

public interface SeanceService {

    public List<Seance> findAll();

    public Seance save(Seance seance);

    public Seance findById(String id);

    public List<Film> findMovieBySeanceId(String id);

    public void delete(String id);

    public Seance putSeance(Seance seance);

}
