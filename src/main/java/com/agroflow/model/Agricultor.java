package com.agroflow.model;

import jakarta.persistence.*;
import java.util.UUID;
import java.time.OffsetDateTime;

@Entity
@Table(name = "agricultores")
public class Agricultor {
  @Id
  private UUID id;
  
  private String nombre;
  private String finca;
  private String ubicacion;
  private String correo;
  
  private OffsetDateTime fechaRegistro;
  
  @PrePersist
  public void pre() {
    if (id == null) id = UUID.randomUUID();
    if (fechaRegistro == null) fechaRegistro = OffsetDateTime.now();
  }
  
  // Getters y Setters
  public UUID getId() { return id; }
  public void setId(UUID id) { this.id = id; }
  
  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  
  public String getFinca() { return finca; }
  public void setFinca(String finca) { this.finca = finca; }
  
  public String getUbicacion() { return ubicacion; }
  public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
  
  public String getCorreo() { return correo; }
  public void setCorreo(String correo) { this.correo = correo; }
  
  public OffsetDateTime getFechaRegistro() { return fechaRegistro; }
  public void setFechaRegistro(OffsetDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}
