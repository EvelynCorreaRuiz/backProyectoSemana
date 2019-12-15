package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqCursoDto;
import com.proyectoSemana.dto.ResponseCursoDto;
import com.proyectoSemana.model.*;
import com.proyectoSemana.util.Constant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MappingObjetosCurso {

    public Curso tranformarDtoaModel(ReqCursoDto reqCursoDto) throws Exception{
        Curso cursoLocal = null;
        try {
            cursoLocal = new Curso();
            cursoLocal.setNombreCurso(reqCursoDto.getNombreCursoDto());
            cursoLocal.setIdCurso(reqCursoDto.getId_cursoDto());

        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return cursoLocal;
    }

    public ResponseCursoDto transformarModelaResponseDto(Curso cursoLocal) throws Exception {
        ResponseCursoDto responseCursoDto = null;
        try {
            responseCursoDto = new ResponseCursoDto();
            responseCursoDto.setNombreCursoDto(cursoLocal.getNombreCurso());

        }catch(Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);

        }
        return responseCursoDto;
    }

    public Curso transformOptionalToCurso(Optional<Curso> cursoOptional) throws Exception{
        Curso curso = null;
        try {
            if (cursoOptional.isPresent()){
                curso = new Curso();
                curso.setIdCurso(cursoOptional.get().getIdCurso());
                curso.setNombreCurso(cursoOptional.get().getNombreCurso());
                curso.setAlumnoList(cursoOptional.get().getAlumnoList());
                curso.setProfesorList(cursoOptional.get().getProfesorList());
                curso.setAsignaturaCursoList(cursoOptional.get().getAsignaturaCursoList());

            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return curso;
    }
}
