package io.hamzaouni.cinema.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * @author Hamza Ouni
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Place implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private double longitde,latitude,altitude;
    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy = "place")
    private Collection<Ticket> tickets;
}
