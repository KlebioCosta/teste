package com.example.atividadeSpring.Service;

import com.example.atividadeSpring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteService {
    @Autowired
    private ClienteRepository repository;
}
