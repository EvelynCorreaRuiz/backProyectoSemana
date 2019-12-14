package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqNotaDto;
import com.proyectoSemana.dto.ResponseNotaDto;
import com.proyectoSemana.model.Nota;
import com.proyectoSemana.util.Constant;

public class MappingObjetosNota {

    public Nota transformarDtoaModel(ReqNotaDto reqNotaDto) throws Exception{
        Nota notaLocal = null;
        try{
            notaLocal = new Nota();
            notaLocal.setIdNota(reqNotaDto.getId_notasDto());
            notaLocal.setAlumno(reqNotaDto.getAlumnoDto());
            notaLocal.setAsignatura(reqNotaDto.getAsignaturaDto());
            notaLocal.setNota1(reqNotaDto.getNota1Dto());
            notaLocal.setNota2(reqNotaDto.getNota2Dto());
            notaLocal.setNota3(reqNotaDto.getNota3Dto());
            notaLocal.setNota4(reqNotaDto.getNota4Dto());
            notaLocal.setControl1(reqNotaDto.getControl1Dto());
            notaLocal.setControl2(reqNotaDto.getControl2Dto());
            notaLocal.setControl3(reqNotaDto.getControl3Dto());
            notaLocal.setControl4(reqNotaDto.getControl4Dto());
            notaLocal.setPromedioNotas(reqNotaDto.getPromedioNota());
            notaLocal.setPromedioControles(reqNotaDto.getPromedioControles());

        }catch(Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_VALIDAR);
        }
        return notaLocal;
    }

    public Nota transformarModelaDto(Nota notaLocal) throws Exception {
        ResponseNotaDto responseNotaDto = null;
        try{
            responseNotaDto = new ResponseNotaDto();
            responseNotaDto.setNota1Dto(notaLocal.getNota1());
            responseNotaDto.setNota2Dto(notaLocal.getNota2());
            responseNotaDto.setNota3Dto(notaLocal.getNota3());
            responseNotaDto.setNota4Dto(notaLocal.getNota4());
            responseNotaDto.setControl1Dto(notaLocal.getControl1());
            responseNotaDto.setControl2Dto(notaLocal.getControl2());
            responseNotaDto.setControl3Dto(notaLocal.getControl3());
            responseNotaDto.setControl4Dto(notaLocal.getControl4());
            responseNotaDto.setPromedioNotasDto(notaLocal.getPromedioNotas());
            responseNotaDto.setPromedioControlesDto(notaLocal.getPromedioControles());

        }catch(Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);

        }
        return notaLocal;
    }
}
