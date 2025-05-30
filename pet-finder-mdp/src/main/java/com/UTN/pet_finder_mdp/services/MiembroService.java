package com.UTN.pet_finder_mdp.services;

import com.UTN.pet_finder_mdp.models.Miembro;
import com.UTN.pet_finder_mdp.models.Rol;
import com.UTN.pet_finder_mdp.repositories.MiembroRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MiembroService {

    public final MiembroRepository miembroRepository;

    public MiembroService(MiembroRepository miembroRepository) {
        this.miembroRepository = miembroRepository;
    }


    public Miembro altaMiembro(Miembro miembro){
        //Ponemos las validaciones
        miembro.setRol(Rol.MIEMBRO);        //Por defecto son miembros.

        return miembroRepository.save(miembro);
    }
}
