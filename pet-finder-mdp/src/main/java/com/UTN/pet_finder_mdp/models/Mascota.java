package com.UTN.pet_finder_mdp.models;

import com.UTN.pet_finder_mdp.models.enums.EstadoMascota;
import com.UTN.pet_finder_mdp.models.enums.TipoMascota;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 20)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @NotNull(message = "El campo Estado de la Mascota es obligatorio.")
    private EstadoMascota estadoMascota;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @NotNull(message = "El campo Tipo de Mascota es obligatorio.")
    private TipoMascota tipoMascota;

    @Size(min = 2, max = 20)
    private String raza;

    @Lob // Lob : Large Object - permite que JPA lo mapee como tipo CLOB
    @Column(length = 1000, nullable = false)
    @NotBlank(message = "El campo Descripción es obligatorio.")
    private String descripcion;

    @Column(nullable = false)
    private Boolean activo;

    // Setters and getters
    public @Size(min = 2, max = 20) String getNombre() {
        return nombre;
    }

    public void setNombre(@Size(min = 2, max = 20) String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "El campo Estado de la Mascota es obligatorio.") EstadoMascota getEstadoMascota() {
        return estadoMascota;
    }

    public void setEstadoMascota(@NotNull(message = "El campo Estado de la Mascota es obligatorio.") EstadoMascota estadoMascota) {
        this.estadoMascota = estadoMascota;
    }

    public @NotNull(message = "El campo Tipo de Mascota es obligatorio.") TipoMascota getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(@NotNull(message = "El campo Tipo de Mascota es obligatorio.") TipoMascota tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public @Size(min = 2, max = 20) String getRaza() {
        return raza;
    }

    public void setRaza(@Size(min = 2, max = 20) String raza) {
        this.raza = raza;
    }

    public @NotBlank(message = "El campo Descripción es obligatorio.") String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(@NotBlank(message = "El campo Descripción es obligatorio.") String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}