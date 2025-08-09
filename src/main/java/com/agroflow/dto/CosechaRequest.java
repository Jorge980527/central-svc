package com.agroflow.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;

public class CosechaRequest {

    @NotNull
    private UUID agricultorId;

    @NotBlank
    private String producto;

    @Positive
    private double toneladas;

    private String ubicacion;

    // Getters y setters

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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
