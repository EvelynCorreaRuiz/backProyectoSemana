package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqAsignaturaDto;
import com.proyectoSemana.dto.ResponseAsignaturaDto;
import com.proyectoSemana.model.Asignatura;
import com.proyectoSemana.model.AsignaturaCurso;
import com.proyectoSemana.model.Nota;
import com.proyectoSemana.util.Constant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MappingObjetosAsignatura{

    public Asignatura transformarDtoaModel(ReqAsignaturaDto reqAsignaturaDto) throws Exception {
        Asignatura asignaturaLocal = null;
        try{
            asignaturaLocal = new Asignatura();
            asignaturaLocal.setIdAsignatura(reqAsignaturaDto.getId_asignaturaDto());
            asignaturaLocal.setNombreAsignatura(reqAsignaturaDto.getNombre_AsignaturaDto());

        }catch(Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return asignaturaLocal;
    }

    public ResponseAsignaturaDto transformarModelaResponse(Asignatura asignaturaLocal) throws Exception{
        ResponseAsignaturaDto asignaturaDto = null;
        try{
            asignaturaDto = new ResponseAsignaturaDto();
            asignaturaDto.setNombre_Asignatura(asignaturaLocal.getNombreAsignatura());
        }catch(Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return asignaturaDto;
    }

    public Asignatura transformarOptionalIntoModel(Optional<Asignatura> asignaturaLocal) throws Exception{
        Asignatura asignatura = null;
        try{
            asignatura = new Asignatura();
            asignatura.setIdAsignatura(asignaturaLocal.get().getIdAsignatura());
            asignatura.setNombreAsignatura(asignaturaLocal.get().getNombreAsignatura());
            asignatura.setAsignaturasCurso(asignaturaLocal.get().getAsignaturasCurso());
            asignatura.setNotaList(asignaturaLocal.get().getNotaList());
        }catch(Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return asignatura;
    }

}
