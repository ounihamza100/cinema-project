package io.hamzaouni.cinema.dao.repositories;

import io.hamzaouni.cinema.dao.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hamza Ouni
 */
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}