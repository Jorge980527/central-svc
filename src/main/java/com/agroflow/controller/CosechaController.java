package com.agroflow.controller;

import com.agroflow.dto.CosechaRequest;
import com.agroflow.model.Cosecha;
import com.agroflow.repository.CosechaRepository;
import com.agroflow.service.CentralService;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cosechas")
public class CosechaController {

    private final CentralService service;
    private final CosechaRepository repo;

    public CosechaController(CentralService service, CosechaRepository repo) {
        this.service = service;
        this.repo = repo;
    }

    @GetMapping
    public List<Cosecha> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Cosecha obtener(@PathVariable UUID id) {
        return repo.findById(id).orElseThrow();
    }

    @PostMapping
    public Cosecha registrar(@Valid @RequestBody CosechaRequest req) {
        Cosecha c = new Cosecha();
        c.setAgricultorId(req.getAgricultorId());
        c.setProducto(req.getProducto());
        c.setToneladas(req.getToneladas());
        return service.registrarCosecha(c);
    }
}
