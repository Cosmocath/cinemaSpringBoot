package com.example.cinema.controllers;

import com.example.cinema.models.Film;
import com.example.cinema.models.Salle;
import com.example.cinema.models.Seance;
import com.example.cinema.services.interfaces.SalleService;
import com.example.cinema.services.interfaces.SeanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("salles")
public class SalleController {
    private SalleService salleService;

    public SalleController(SalleService salleService) {
        this.salleService = salleService;
    }

    @GetMapping
    public List<Salle> findAll() {
        return this.salleService.findAll();
    }

    @PostMapping
    public Salle save(@RequestBody Salle salle) {
        return this.salleService.save(salle);
    }

    @GetMapping("{id}")
    public Salle findById(@PathVariable String id){
        return this.salleService.findById(id);
    }

    @GetMapping("{id}/seances")
    public List<Seance> findSeancesbySalle(@PathVariable String id) {
        return this.salleService.findSeanceBySalleId(id);
    }

    /** TO DO
    @GetMapping("")
    public List<Film> findFilmbySalleandSeance(@PathVariable String id){
        return this.salleService.findSeanceBySalleId(id)
    }**/



}
