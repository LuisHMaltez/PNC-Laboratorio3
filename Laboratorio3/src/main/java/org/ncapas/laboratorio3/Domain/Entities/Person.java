package org.ncapas.laboratorio3.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPerson;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String email;

    private String password;

    @ManyToOne
    @JoinColumn(name = "idRole", nullable = false, foreignKey = @ForeignKey(name = "FK_Role")) // rol
    private Role role;
}
