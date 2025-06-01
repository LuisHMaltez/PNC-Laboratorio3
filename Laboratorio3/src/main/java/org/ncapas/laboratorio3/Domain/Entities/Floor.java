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
public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idFloor;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "colors_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Colors"))
    private Colors colors ; //Color del boton del piso
}
