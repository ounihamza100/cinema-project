package io.hamzaouni.cinema.dao.repositories;

import io.hamzaouni.cinema.dao.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hamza Ouni
 */
public interface PlaceRepository extends JpaRepository<Place,Long> {
}
