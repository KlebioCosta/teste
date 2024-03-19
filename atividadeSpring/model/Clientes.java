package com.example.atividadeSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String nome;
    private String curso;
}
