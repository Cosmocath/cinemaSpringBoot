package com.example.cinema.services.interfaces;

import com.example.cinema.models.Film;

import java.util.List;

public interface FilmService {
    public List<Film> findAll();
    public Film save(Film film);
    public void delete(String id);
    public Film putFilm(Film film);
}
