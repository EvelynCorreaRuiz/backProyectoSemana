package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqAlumnoDto;
import com.proyectoSemana.model.Alumno;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.model.Nota;
import com.proyectoSemana.util.Constant;

import java.util.List;

public class MappingObjetosAlumno {

    public Alumno tranformarDtoaModel(ReqAlumnoDto alumnoDto, Login login, Curso curso, List<Nota> notaList) throws Exception{
        Alumno alumnoLocal = null;
        try {
            alumnoLocal.setNombreAlumno(alumnoDto.getNombre_AlumnoDto());
            alumnoLocal.setApellidoAlumno(alumnoDto.getApellido_AlumnoDto());
            alumnoLocal.setRut(alumnoDto.getRut_AlumnoDto());
            alumnoLocal.setId_alumno(alumnoDto.getId_alumnoDto());
            alumnoLocal.setCurso(curso);
            alumnoLocal.setLogin(login);
            alumnoLocal.setNotaList(notaList);
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return alumnoLocal;
    }

}
