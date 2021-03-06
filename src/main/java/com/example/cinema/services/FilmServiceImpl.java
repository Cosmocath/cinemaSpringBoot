package com.example.cinema.services;

import com.example.cinema.models.Film;
import com.example.cinema.repositories.FilmRepository;
import com.example.cinema.services.interfaces.FilmService;

import java.util.List;

public class FilmServiceImpl implements FilmService {

    private FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAll();
    }

    @Override
    public Film save(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public void delete(String id) {
        this.filmRepository.deleteById(id);
    }

    @Override
    public Film putFilm(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public Film findFilmbyNom(String nom) {
        Film film= this.filmRepository.findFirstByNom(nom);
        film.setNom(film.getNom().toUpperCase());
        return film;
    }
}
