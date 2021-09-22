package com.example.cinema.services.interfaces;

import com.example.cinema.models.Film;
import com.example.cinema.models.Salle;
import com.example.cinema.models.Seance;

import java.util.List;

public interface SalleService {
    public List<Salle> findAll();

    public Salle save(Salle salle);

    public Salle findById(String id);

    public List<Seance> findSeanceBySalleId(String id);

    public void delete(String id);

    public Salle putSalle(Salle salle);
}
