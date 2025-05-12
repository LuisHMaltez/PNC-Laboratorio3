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
public class Tones {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTones;
    @Column
    private String Tones;
}
