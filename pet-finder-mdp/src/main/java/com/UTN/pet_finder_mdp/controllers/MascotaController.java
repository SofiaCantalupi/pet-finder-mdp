package com.UTN.pet_finder_mdp.controllers;

import com.UTN.pet_finder_mdp.models.Mascota;
import com.UTN.pet_finder_mdp.services.MascotaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {
    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @PostMapping
    public ResponseEntity<Mascota> alta(@Valid @RequestBody Mascota mascota){
        Mascota creada = mascotaService.alta(mascota);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
        Mascota encontrada = mascotaService.buscarPorId(id);

        if (encontrada == null){
            
        }
    }
}
