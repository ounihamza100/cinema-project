package io.hamzaouni.cinema.dao.repositories;

import io.hamzaouni.cinema.dao.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hamza Ouni
 */
public interface SeanceRepository extends JpaRepository<Seance,Long> {
}
