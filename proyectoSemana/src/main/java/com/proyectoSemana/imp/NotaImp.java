package com.proyectoSemana.imp;


import com.proyectoSemana.dto.ReqNotaDto;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.model.Nota;
import com.proyectoSemana.service.INotaService;
import com.proyectoSemana.util.Constant;


public class NotaImp implements INotaService{


    @Override
    public double calcularPromedioNotas(ReqNotaDto reqNotaDto) throws Exception {
        Nota notaLocal = null;
        double suma = 0;
        try {
            notaLocal.setNota1(reqNotaDto.getNota1Dto());
            notaLocal.setNota2(reqNotaDto.getNota2Dto());
            notaLocal.setNota3(reqNotaDto.getNota3Dto());
            notaLocal.setNota4(reqNotaDto.getNota4Dto());
            if (0 != suma){
                suma = notaLocal.getNota1() + notaLocal.getNota2()
                        + notaLocal.getNota3() + notaLocal.getNota4();
                suma = suma / 4;
                return suma;
            }else {
                throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
            }
        }catch (NoEncontradoException ex){
            ex.printStackTrace();
            throw new NoEncontradoException(ex.getMessage());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
    }
}

