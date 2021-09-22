package com.example.cinema.controllers;

import com.example.cinema.models.Film;
import com.example.cinema.models.Seance;
import com.example.cinema.services.interfaces.SeanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("seances")
public class SeanceController {

    private SeanceService seanceService;

    public SeanceController(SeanceService seanceService) {
        this.seanceService = seanceService;
    }

    @GetMapping
    public List<Seance> findAll() {
        return this.seanceService.findAll();
    }

    @PostMapping
    public Seance save(@RequestBody Seance seance) {
        return this.seanceService.save(seance);
    }

    @GetMapping("{id}")
    public Seance findById(@PathVariable String id){
        return this.seanceService.findById(id);
    }

    @GetMapping("{id}/films")
    public List<Film> findFilmsbySeance(@PathVariable String id) {
        return this.seanceService.findMovieBySeanceId(id);
    }

}
