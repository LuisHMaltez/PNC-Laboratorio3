package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/*pisos
El Ala Esmeralda
La Torre del Crepusculo
* */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Floor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idFloor;
    @Column
    private String name;
    @Column
    private String buttonColor;

    @OneToOne
    @JoinColumn(name = "idtones", nullable = false, foreignKey = @ForeignKey(name = "FK_idTones"))
    private Tones tones ;
}

/*Crear un catalogo para
* purpura espectral
* verde esmeralda
* */
