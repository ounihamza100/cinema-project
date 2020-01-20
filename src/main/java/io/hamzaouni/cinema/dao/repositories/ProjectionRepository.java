package io.hamzaouni.cinema.dao.repositories;

import io.hamzaouni.cinema.dao.entities.Projection;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hamza Ouni
 */
public interface ProjectionRepository extends JpaRepository<Projection,Long> {
}
