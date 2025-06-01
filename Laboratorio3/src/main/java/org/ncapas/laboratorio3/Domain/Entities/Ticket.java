package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTicket;

    @ManyToOne
    @JoinColumn(name = "guest_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Guest"))
    private Guest guest;

    @ManyToOne
    @JoinColumn(name = "reservation_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Reservation"))
    private Reservation reservation;

    @Column(nullable = false)
    private LocalDate dateTicket;

    @Column(nullable = false)
    private BigDecimal total;
}
