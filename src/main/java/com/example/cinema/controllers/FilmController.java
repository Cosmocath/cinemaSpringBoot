package com.example.cinema.controllers;

import com.example.cinema.models.Film;
import com.example.cinema.services.interfaces.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("films")
public class FilmController {
    public FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> findAll(){
        return this.filmService.findAll();
    }

    @PostMapping
    public Film save(@RequestBody Film film){
        return this.filmService.save(film);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        this.filmService.delete(id);
    }

    @PutMapping
    public Film putFilm(@RequestBody Film film){
        return this.filmService.putFilm(film);
    }


}
