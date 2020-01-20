package io.hamzaouni.cinema.dao.repositories;

import io.hamzaouni.cinema.dao.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hamza Ouni
 */
public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
