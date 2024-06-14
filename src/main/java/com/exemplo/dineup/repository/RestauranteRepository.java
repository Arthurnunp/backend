package com.exemplo.dineup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.dineup.model.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
