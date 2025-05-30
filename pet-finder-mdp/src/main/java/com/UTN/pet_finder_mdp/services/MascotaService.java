package com.UTN.pet_finder_mdp.services;

import com.UTN.pet_finder_mdp.models.Mascota;
import com.UTN.pet_finder_mdp.repositories.MascotaRepository;
import com.UTN.pet_finder_mdp.validations.MascotaValidador;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MascotaService {
    private final MascotaRepository mascotaRepository;
    private final MascotaValidador mascotaValidador;

    public MascotaService(MascotaRepository mascotaRepository, MascotaValidador mascotaValidador){
        this.mascotaRepository = mascotaRepository;
        this.mascotaValidador = mascotaValidador;
    }

    // CRUD
    public Mascota alta(Mascota mascota){
        mascota.setActivo(true);
        return mascotaRepository.save(mascota);
    }

    public Mascota buscarPorId(Long id){
        mascotaValidador.validarId(id);
        Optional<Mascota> encontrada = mascotaRepository.findById(id);
        return encontrada.get();
    }
}
