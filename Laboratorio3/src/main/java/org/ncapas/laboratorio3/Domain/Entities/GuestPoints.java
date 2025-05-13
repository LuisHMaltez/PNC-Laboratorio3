package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idGuestPoints;

    @Column
    private double Point;

    @Column
    private String PointOrigin;
    @Column
    private Date LastSum;

    @oneToOne
    @JoinColumn(name = "idPerson", nullable = false, foreignKey = @ForeignKey(name = "FK_Person"))// id de la persona
    private Person person;
}
