package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqProfesorDto;
import com.proyectoSemana.dto.ResponseProfesorDto;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.model.Profesor;
import com.proyectoSemana.util.Constant;

import java.util.Optional;

public class MappingObjetosProfesor {

    public Profesor transformarOptionalaProfesor(Optional<Profesor> profesorOptional) throws Exception{
        Profesor profesorLocal = null;
        try {
            if (profesorOptional.isPresent()) {
                profesorLocal = new Profesor();
                profesorLocal.setId_profesor(profesorOptional.get().getId_profesor());
                profesorLocal.setNombreProfesor(profesorOptional.get().getNombreProfesor());
                profesorLocal.setApellidoProfesor(profesorOptional.get().getApellidoProfesor());
                profesorLocal.setRutProfesor(profesorOptional.get().getRutProfesor());
                profesorLocal.setLogin(profesorOptional.get().getLogin());
                profesorLocal.setCurso(profesorOptional.get().getCurso());
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return profesorLocal;
    }

    public ResponseProfesorDto transformarModelaDtoResponse(Profesor profesorLocal) throws Exception{
        ResponseProfesorDto profesorDto = null;
        try {
            profesorDto = new ResponseProfesorDto();
            profesorDto.setNombre_Profesor(profesorLocal.getNombreProfesor());
            profesorDto.setApellido_Profesor(profesorLocal.getApellidoProfesor());
            profesorDto.setRut_Profesor(profesorLocal.getRutProfesor());

        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return profesorDto;
    }



}
