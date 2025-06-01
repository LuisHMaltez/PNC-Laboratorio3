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

    private double point;

    @Column(nullable = false)
    private String pointOrigin;

    @Column
    private Date LastSum;

    @OneToOne
    @JoinColumn(name = "guest_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Guest"))
    private Guest guest;
}
