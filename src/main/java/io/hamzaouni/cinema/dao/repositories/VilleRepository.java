package io.hamzaouni.cinema.dao.repositories;

import io.hamzaouni.cinema.dao.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hamza Ouni
 */
public interface VilleRepository extends JpaRepository<Ville,Long> {
}
