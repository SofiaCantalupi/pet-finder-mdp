package com.UTN.pet_finder_mdp.validations;

import com.UTN.pet_finder_mdp.models.Mascota;
import com.UTN.pet_finder_mdp.repositories.MascotaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MascotaValidador {
    private final MascotaRepository mascotaRepository;

    public MascotaValidador(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    public void validarId(Long id){
        if(!mascotaRepository.existsById(id)){
            throw new EntityNotFoundException("No se encontró un mascota con el ID: " + id);
        }
    }
}
