package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqCursoDto;
import com.proyectoSemana.dto.ResponseCursoDto;
import com.proyectoSemana.model.*;
import com.proyectoSemana.util.Constant;
import java.util.List;

public class MappingObjetosCurso {

    public Curso tranformarDtoaModel(ReqCursoDto reqCursoDto, List<Alumno> alumnoList, List<Profesor> profesorList, List<AsignaturasCurso> asignaturasCursoList) throws Exception{
        Curso cursoLocal = null;
        try {
            cursoLocal = new Curso();
            cursoLocal.setNombreCurso(reqCursoDto.getNombreCursoDto());
            cursoLocal.setIdCurso(reqCursoDto.getId_cursoDto());
            cursoLocal.setAlumnoList(alumnoList);
            cursoLocal.setProfesorList(profesorList);
            cursoLocal.setAsignaturaCursoList(asignaturasCursoList);
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return cursoLocal;
    }

    public ResponseCursoDto transformarModelaDto(Curso cursoLocal) throws Exception {
        ResponseCursoDto responseCursoDto = null;
        try {
            responseCursoDto = new ResponseCursoDto();
            responseCursoDto.setNombreCurso(cursoLocal.getNombreCurso());

        }catch(Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);

        }
        return responseCursoDto;
    }
}
