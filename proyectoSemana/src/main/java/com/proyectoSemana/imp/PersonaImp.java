//package encargado de logica de negocio
package com.proyectoSemana.imp;

import com.proyectoSemana.dto.ReqPersonaDto;
import com.proyectoSemana.dto.ResponsePersonaDto;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.mapping.MappingObjectosPersona;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.model.Persona;
import com.proyectoSemana.model.Rol;
import com.proyectoSemana.repository.PersonaRepository;
import com.proyectoSemana.service.IPersonaService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonaImp implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private RolImp rolImp;

    @Autowired
    private LoginImp loginImp;

    @Autowired
    private MappingObjectosPersona mappingObjectosPersona;

    @Override
    public ResponsePersonaDto guardarPersona(ReqPersonaDto persona) throws Exception {
        Persona personaLocal;
        ResponsePersonaDto personaDto;
        try {
            Login login = loginImp.buscarPorId(persona.getIdLoginDto());
            Rol rol = rolImp.buscarRolporId(persona.getIdRolDto());

            if(null != login && null != rol && persona.getIdPersonaDto() == null){
                persona.setFechaCreacionDto(new Date());
                persona.setActiveDto((byte)1);
                persona.setFechaActualizacionDto(null);
                personaLocal = personaRepository.save(mappingObjectosPersona.transformDtoIntoModel(persona,login,rol));
                personaDto = mappingObjectosPersona.transformModelIntoDtoResponse(personaLocal);

            }else{
                throw new NoGuardarException(Constant.ERROR_GUARDAR);
            }

        }catch (NoGuardarException ex){
            ex.printStackTrace();
            throw new NoGuardarException(ex.getMessage());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return personaDto;
    }






}
