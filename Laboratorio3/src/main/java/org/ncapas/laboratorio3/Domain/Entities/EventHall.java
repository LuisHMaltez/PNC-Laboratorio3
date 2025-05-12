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
public class EventHall {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEventHall;
    @Column
    private String name;
    @Column
    private int Capacity;
    @Column
    private String Distinctive;
}
