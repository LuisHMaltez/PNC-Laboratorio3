package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Royalty {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idRoyalty;

    private String name;

    private String description;

    private Integer pointCost;
}
