package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqNotaDto;
import com.proyectoSemana.dto.ResponseNotaDto;
import com.proyectoSemana.model.Nota;
import com.proyectoSemana.util.Constant;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MappingObjetosNota {

    public Nota transformarDtoaModel(ReqNotaDto reqNotaDto) throws Exception{
        Nota notaLocal = null;
        try{
            notaLocal = new Nota();
            notaLocal.setIdNota(reqNotaDto.getId_notasDto());
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

    public Nota transformarOptionaNota(Optional<Nota> optionalNota) throws Exception{
        Nota notaLocal = null;
        try {
            if (optionalNota.isPresent()){
                notaLocal = new Nota();
                notaLocal.setIdNota(optionalNota.get().getIdNota());
                notaLocal.setNota1(optionalNota.get().getNota1());
                notaLocal.setNota2(optionalNota.get().getNota2());
                notaLocal.setNota3(optionalNota.get().getNota3());
                notaLocal.setNota4(optionalNota.get().getNota4());
                notaLocal.setControl1(optionalNota.get().getControl1());
                notaLocal.setControl2(optionalNota.get().getControl2());
                notaLocal.setControl3(optionalNota.get().getControl3());
                notaLocal.setControl4(optionalNota.get().getControl4());
                notaLocal.setPromedioNotas(optionalNota.get().getPromedioNotas());
                notaLocal.setPromedioControles(optionalNota.get().getPromedioControles());
                notaLocal.setAlumno(optionalNota.get().getAlumno());
                notaLocal.setAsignatura(optionalNota.get().getAsignatura());
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return notaLocal;
    }

    public ResponseNotaDto transformarModelaResponseDtoNota1(Nota notaLocal) throws Exception {
        ResponseNotaDto responseNotaDto = null;
        try{
            responseNotaDto = new ResponseNotaDto();
            responseNotaDto.setNota1Dto(notaLocal.getNota1());

        }catch(Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);

        }
        return responseNotaDto;
    }
}
