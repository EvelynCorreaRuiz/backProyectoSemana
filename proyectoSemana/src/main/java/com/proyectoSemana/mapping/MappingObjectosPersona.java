//package encargado de mapear objetos
package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqPersonaDto;
import com.proyectoSemana.dto.ResponsePersonaDto;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.model.Persona;
import com.proyectoSemana.model.Rol;
import com.proyectoSemana.util.Constant;
import org.springframework.stereotype.Service;

@Service
public class MappingObjectosPersona {

    public Persona transformDtoIntoModel(ReqPersonaDto persona, Login login, Rol rol) throws Exception {
        Persona personaLocal = null;
        try {
            personaLocal = new Persona();
            personaLocal.setIdPersona(persona.getIdPersonaDto());
            personaLocal.setLogin(login);
            personaLocal.setRol(rol);
            personaLocal.setNombrePersona(persona.getNombrePersonaDto().toUpperCase());
            personaLocal.setApellidoPersona(persona.getApellidoPersonaDto().toUpperCase());
<<<<<<< HEAD
=======

>>>>>>> 8d6b6062a66b0a985135bdb09e31cad1dbf6d149
            personaLocal.setRutPersona(persona.getRutPersonaDto());

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return personaLocal;
    }

    public ResponsePersonaDto transformModelIntoDtoResponse(Persona personaLocal) throws Exception {
        ResponsePersonaDto personaDto = null;
        try {
            personaDto = new ResponsePersonaDto();
            personaDto.setEmailLoginDto(personaLocal.getLogin().getEmail());
            personaDto.setNombrePersonaDto(personaLocal.getNombrePersona());
            personaDto.setTipoRolDto(personaLocal.getRol().getTipo());
            personaDto.setApellidoPersonaDto(personaLocal.getApellidoPersona());
            personaDto.setRutPersonaDto(personaLocal.getRutPersona());

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return personaDto;
    }
}
