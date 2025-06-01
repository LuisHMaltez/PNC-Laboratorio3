package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idSchedule;

    @Column
    private Date day;

    @Column
    private double hour;

    @Column
    private boolean status;

    @Column
    private LocalTime startTime;

    @Column
    private LocalTime endTime;

    @Column(name = "day_of_week")
    private String dayOfWeek;
}

