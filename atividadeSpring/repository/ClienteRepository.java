package com.example.atividadeSpring.repository;

import com.example.atividadeSpring.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository {
    List<Clientes> cliente();

}
