package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqAsignaturaDto;
import com.proyectoSemana.dto.ResponseAsignaturaDto;
import com.proyectoSemana.model.Asignatura;
import com.proyectoSemana.model.AsignaturasCurso;
import com.proyectoSemana.model.Nota;
import com.proyectoSemana.util.Constant;

import java.util.List;

public class MappingObjetosAsignatura{

    public Asignatura transformarDtoaModel(ReqAsignaturaDto reqAsignaturaDto, List<Nota> notaList, List<AsignaturasCurso> asignaturasCursoList) throws Exception {
        Asignatura asignaturaLocal = null;
        try{
            asignaturaLocal = new Asignatura();
            asignaturaLocal.setAsignaturasCurso(reqAsignaturaDto.getAsignaturaCursoListDto());
            asignaturaLocal.setIdAsignatura(reqAsignaturaDto.getId_asignaturaDto());
            asignaturaLocal.setNotaList(reqAsignaturaDto.getNotaListDto());
            asignaturaLocal.setAsignaturasCurso(reqAsignaturaDto.getAsignaturaCursoListDto());

        }catch(Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return asignaturaLocal;
    }

    public Asignatura transformarModelaDto(Asignatura asignaturaLocal) throws Exception{
        ResponseAsignaturaDto responseAsignaturaDto = null;
        try{
            responseAsignaturaDto = new ResponseAsignaturaDto();
            responseAsignaturaDto.setNombre_Asignatura(asignaturaLocal.getNombreAsignatura());
        }catch(Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return asignaturaLocal;
    }

}
