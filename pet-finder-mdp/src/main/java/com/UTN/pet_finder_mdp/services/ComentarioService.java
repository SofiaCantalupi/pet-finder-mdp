package com.UTN.pet_finder_mdp.services;


import com.UTN.pet_finder_mdp.dto.ComentarioDetailDTO;
import com.UTN.pet_finder_mdp.dto.ComentarioListDTO;
import com.UTN.pet_finder_mdp.dto.ComentarioRequestDTO;
import com.UTN.pet_finder_mdp.models.Comentario;
import com.UTN.pet_finder_mdp.repositories.ComentarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ComentarioService {


    private final ComentarioRepository comentarioRepository;
    //private final
    //private final
    //agregar los repositorios de publicacion y de usuario porque son necesarios para buscarlos por id





    public ComentarioService(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }




    public ComentarioDetailDTO crearComentario(ComentarioRequestDTO requestDTO) {


        //validaciones para chequear que exista dicha publicacion y dicho usuario.
        Publicacion publicacion = publicacionRepository.findById(requestDTO.getIdPublicacion())
                .orElseThrow(() -> new RuntimeException("Publicación no encontrada con esa ID " + requestDTO.getIdPublicacion()));

        Usuario usuario = usuarioRepository.findById(requestDTO.getIdUsuario())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con esa ID " + requestDTO.getIdUsuario()));

        //cambiar la exception a entityNotFound


        Comentario comentario = new Comentario();

        comentario.setTexto(requestDTO.getTexto());
        comentario.setFechaPublicacion(LocalDate.now());
        comentario.setPublicacion(publicacion);
        comentario.setUsuario(usuario);



        //hay que hacer esto porque la base de datos es la genera los ids, si retorno "comentario", no va a tener id
        Comentario guardado = comentarioRepository.save(comentario);

        return new ComentarioDetailDTO(
                guardado.getId(),
                guardado.getTexto(),
                guardado.getFechaPublicacion(),
                publicacion.getId(),
                usuario.getId(),
                usuario.getNombre()
        );
    }








    public List<ComentarioListDTO> listarComentarios() {
        return comentarioRepository.findAll().stream()
                .map(comentario -> new ComentarioListDTO(
                        comentario.getId(),
                        comentario.getTexto(),
                        comentario.getFechaPublicacion(),
                        comentario.getPublicacion().getId(),    //esto va a dar error hasta que se agreguen las clases publicacion y usuario.
                        comentario.getUsuario().getId()
                ))
                .toList();
    }










    public void eliminarComentarioPorID(Long id){
        if (!comentarioRepository.existsById(id)) throw new RuntimeException("No existe un comentario con esa id");
    }


}
