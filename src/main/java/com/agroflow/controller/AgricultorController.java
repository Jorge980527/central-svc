package com.agroflow.controller;

import com.agroflow.model.Agricultor;
import com.agroflow.repository.AgricultorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/agricultores")
public class AgricultorController {

    private final AgricultorRepository repo;

    public AgricultorController(AgricultorRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Agricultor> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Agricultor obtener(@PathVariable UUID id) {
        return repo.findById(id).orElseThrow();
    }

    @PostMapping
    public Agricultor crear(@RequestBody Agricultor agricultor) {
        return repo.save(agricultor);
    }

    @PutMapping("/{id}")
    public Agricultor actualizar(@PathVariable UUID id, @RequestBody Agricultor datos) {
        Agricultor a = repo.findById(id).orElseThrow();
        a.setNombre(datos.getNombre());
        a.setFinca(datos.getFinca());
        a.setUbicacion(datos.getUbicacion());
        a.setCorreo(datos.getCorreo());
        return repo.save(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable UUID id) {
        repo.deleteById(id);
    }
}

