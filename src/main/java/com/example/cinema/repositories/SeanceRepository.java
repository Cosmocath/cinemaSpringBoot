package com.example.cinema.repositories;

import com.example.cinema.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeanceRepository extends MongoRepository<Seance, String> {
}
