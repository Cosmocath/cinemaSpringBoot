package com.example.cinema;

import com.example.cinema.repositories.FilmRepository;
import com.example.cinema.repositories.SalleRepository;
import com.example.cinema.repositories.SeanceRepository;
import com.example.cinema.services.SalleServiceImpl;
import com.example.cinema.services.SeanceServiceImpl;
import com.example.cinema.services.interfaces.FilmService;
import com.example.cinema.services.FilmServiceImpl;
import com.example.cinema.services.interfaces.SalleService;
import com.example.cinema.services.interfaces.SeanceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilmService filmService (FilmRepository filmRepository){
        return new FilmServiceImpl(filmRepository);
    }

    @Bean
    public SeanceService seanceService(SeanceRepository seanceRepository, FilmRepository filmRepository){
        return new SeanceServiceImpl(seanceRepository,filmRepository);

    }

    @Bean
    public SalleService salleService(SalleRepository salleRepository,SeanceRepository seanceRepository, FilmRepository filmRepository){
        return new SalleServiceImpl(salleRepository,seanceRepository,filmRepository);
    }

}
