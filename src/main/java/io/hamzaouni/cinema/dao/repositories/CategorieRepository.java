package io.hamzaouni.cinema.dao.repositories;

import io.hamzaouni.cinema.dao.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hamza Ouni
 */
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
