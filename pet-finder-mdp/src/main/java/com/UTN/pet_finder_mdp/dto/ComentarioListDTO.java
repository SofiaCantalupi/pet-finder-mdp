package com.UTN.pet_finder_mdp.dto;

import java.time.LocalDate;

public class ComentarioListDTO {


    private Long id;
    private String texto;
    private LocalDate fechaPublicacion;
    private Long idPublicacion;
    private Long idUsuario;






    public Long getId() {
        return id;
    }

    public ComentarioListDTO(Long id, String texto, LocalDate fechaPublicacion, Long idPublicacion, Long idUsuario) {
        this.id = id;
        this.texto = texto;
        this.fechaPublicacion = fechaPublicacion;
        this.idPublicacion = idPublicacion;
        this.idUsuario = idUsuario;
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
