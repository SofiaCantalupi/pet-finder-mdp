package com.UTN.pet_finder_mdp.validations;

import com.UTN.pet_finder_mdp.exceptions.formatoInvalidoException;
import com.UTN.pet_finder_mdp.models.Miembro;
import org.springframework.stereotype.Component;

@Component
public class MiembroValidation {

    public void validarNombre(Miembro miembro){
        String regex = "^[A-Za-zñÑáéíóúÁÉÍÓÚ ]{3,15}$";
        //Hace que puedan ser mayus o minus, con tildes y ñ, de 3 a 15 caracteres.
        if(!miembro.getNombre().matches(regex)){
            throw new formatoInvalidoException("El nombre no cumple con el formato. Recordá que no debe contener numeros y su longitud debe ser de 3 a 15 caracteres.");
        }
    }

    public void validarApellido(Miembro miembro){
        String regex = "^[A-Za-zñÑáéíóúÁÉÍÓÚ ]{3,15}$";
        //Hace que puedan ser mayus o minus, con tildes y ñ, de 3 a 15 caracteres.
        if(!miembro.getApellido().matches(regex)){
            throw new formatoInvalidoException("El apellido no cumple con el formato. Recordá que no debe contener numeros y su longitud debe ser de 3 a 15 caracteres.");
        }
    }

    //Email
    //Contraseña
}
