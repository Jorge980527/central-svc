package com.agroflow.repository;

import com.agroflow.model.Agricultor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AgricultorRepository extends JpaRepository<Agricultor, UUID> {
}
