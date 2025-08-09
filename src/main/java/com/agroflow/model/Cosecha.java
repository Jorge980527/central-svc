package com.agroflow.model;

import jakarta.persistence.*;
import java.util.UUID;
import java.time.OffsetDateTime;

@Entity
public class Cosecha {

    @Id
    private UUID id;

    @Column(nullable = false)
    private UUID agricultorId;

    @Column(nullable = false)
    private String producto;

    @Column(nullable = false)
    private double toneladas;

    private String estado = "REGISTRADA";

    private OffsetDateTime creadoEn = OffsetDateTime.now();

    private UUID facturaId;

    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID();
        }
        if (creadoEn == null) {
            creadoEn = OffsetDateTime.now();
        }
        if (estado == null) {
            estado = "REGISTRADA";
        }
    }

    // Getters y setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getAgricultorId() {
        return agricultorId;
    }

    public void setAgricultorId(UUID agricultorId) {
        this.agricultorId = agricultorId;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public OffsetDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(OffsetDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }

    public UUID getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(UUID facturaId) {
        this.facturaId = facturaId;
    }
}

