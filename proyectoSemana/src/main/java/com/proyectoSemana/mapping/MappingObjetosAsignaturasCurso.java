package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqAsignaturaCursoDto;

import com.proyectoSemana.dto.ResponseAsignaturaCursoDto;
import com.proyectoSemana.model.AsignaturaCurso;
import com.proyectoSemana.util.Constant;
import org.springframework.stereotype.Service;

@Service
public class MappingObjetosAsignaturasCurso {

    public AsignaturaCurso transformarDtoaModel(ReqAsignaturaCursoDto reqAsignaturaCursoDto) throws Exception{
        AsignaturaCurso asignaturaCursoLocal = null;
        try {
            asignaturaCursoLocal = new AsignaturaCurso();
            asignaturaCursoLocal.setId(reqAsignaturaCursoDto.getId_AsignaturaCursoDto());
            asignaturaCursoLocal.setAsignatura(reqAsignaturaCursoDto.getAsignaturaDto());
            asignaturaCursoLocal.setCurso(reqAsignaturaCursoDto.getCursoDto());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);

        }
        return asignaturaCursoLocal;
    }

    public ResponseAsignaturaCursoDto transformarModelaDto(AsignaturaCurso asignaturaCurso) throws Exception{
        ResponseAsignaturaCursoDto asignaturaCursoDtoLocal = null;
        try {
            asignaturaCursoDtoLocal = new ResponseAsignaturaCursoDto();
            //asignaturaCursoDtoLocal.setAsignaturaDto(asignaturaCurso.getAsignatura());
            //asignaturaCursoDtoLocal.setCursoDto(asignaturaCurso.getCurso());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return asignaturaCursoDtoLocal;
    }
}
