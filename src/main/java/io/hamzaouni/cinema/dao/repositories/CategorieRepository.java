package io.hamzaouni.cinema.dao.repositories;

import io.hamzaouni.cinema.dao.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Hamza Ouni
 */
@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
