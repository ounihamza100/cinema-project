package io.hamzaouni.cinema.dao.repositories;

import io.hamzaouni.cinema.dao.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hamza Ouni
 */
public interface SalleRepository extends JpaRepository<Salle,Long> {
}
