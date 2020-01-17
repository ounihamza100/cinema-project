package io.hamzaouni.cinema.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Hamza Ouni
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //numéro du ticket c'est numéro de la place
    private String nomClient;
    private double prix;
    @Column(unique = true)
    private int codePayement;
    private boolean reserve;
    @ManyToOne
    private Place place;
    @ManyToOne
    private Projection projection;
}
