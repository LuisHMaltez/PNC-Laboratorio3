package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
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

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    @Min(0)
    private Integer pointCost;
}
