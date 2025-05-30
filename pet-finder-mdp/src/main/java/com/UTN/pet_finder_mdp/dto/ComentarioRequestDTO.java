package com.UTN.pet_finder_mdp.dto;

import java.time.LocalDate;

public class ComentarioRequestDTO {


    private Long id;
    private String texto;
    private LocalDate fechaPublicacion;
    private Long idPublicacion;
    private Long idUsuario;


    public ComentarioRequestDTO() {
    }





    public Long getId() {
        return id;
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Long getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
