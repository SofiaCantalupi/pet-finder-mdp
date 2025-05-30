package com.UTN.pet_finder_mdp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ComentarioResponseDTO {




    @NotBlank(message = "El comentario tiene que tener texto")
    @Size(max=150, message="Máximo 150 caracteres")
    private String texto;

    @NotNull(message = "La fecha de publicacion es obligatoria")
    private LocalDate fechaPublicacion;

    @NotNull(message = "Debe estar asociado a una publicacion")
    private Long idPublicacion;

    @NotNull(message = "Debe estar asociado a un Usuario")
    private Long idUsuario;









    public @NotBlank(message = "El comentario tiene que tener texto") String getTexto() {
        return texto;
    }

    public void setTexto(@NotBlank(message = "El comentario tiene que tener texto") String texto) {
        this.texto = texto;
    }

    public @NotNull(message = "La fecha de publicacion es obligatoria") LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(@NotNull(message = "La fecha de publicacion es obligatoria") LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public @NotNull(message = "Debe estar asociado a una publicacion") Long getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(@NotNull(message = "Debe estar asociado a una publicacion") Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public @NotNull(message = "Debe estar asociado a un Usuario") Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(@NotNull(message = "Debe estar asociado a un Usuario") Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
