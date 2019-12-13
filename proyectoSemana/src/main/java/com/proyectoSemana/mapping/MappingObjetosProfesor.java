package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqProfesorDto;
import com.proyectoSemana.dto.ResponseProfesorDto;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.model.Profesor;
import com.proyectoSemana.util.Constant;

public class MappingObjetosProfesor {

    public Profesor transformarDtoaModel(ReqProfesorDto reqProfesorDto, Login login, Curso curso) throws Exception{
        Profesor profesorLocal = null;
        try {
            profesorLocal = new Profesor();
            profesorLocal.setApellidoProfesor(reqProfesorDto.getApellido_ProfesorDto());
            profesorLocal.setNombreProfesor(reqProfesorDto.getNombre_ProfesorDto());
            profesorLocal.setRutProfesor(reqProfesorDto.getRut_ProfesorDto());
            profesorLocal.setId_profesor(reqProfesorDto.getIdProfesorDto());
            profesorLocal.setLogin(login);
            profesorLocal.setCurso(curso);

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
