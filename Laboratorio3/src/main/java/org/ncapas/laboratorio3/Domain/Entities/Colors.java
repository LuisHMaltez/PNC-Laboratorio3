package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Colors {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idColors;

    @Column(nullable = false)
    private String colorName;

    @Column(nullable = false)
    private String hexCode;



}
