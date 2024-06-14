package com.exemplo.dineup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.exemplo.dineup.model.Restaurante;
import com.exemplo.dineup.repository.RestauranteRepository;

import java.util.List;

@RestController
@RequestMapping("/api/restaurantes")
@CrossOrigin(origins = "http://localhost:3000")
public class RestauranteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @GetMapping
    public List<Restaurante> getAllRestaurantes() {
        return restauranteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Restaurante getRestauranteById(@PathVariable Long id) {
        return restauranteRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Restaurante createRestaurante(@RequestBody Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }
}
