package com.proyectoSemana.imp;


import com.proyectoSemana.dto.ReqNotaDto;
import com.proyectoSemana.dto.ResponseNotaDto;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.model.Nota;
import com.proyectoSemana.service.INotaService;
import com.proyectoSemana.util.Constant;


public class NotaImp implements INotaService {


    @Override
    public double calcularPromedioNotas(ReqNotaDto reqNotaDto) throws Exception {
        Nota notaLocal = null;
        double suma = 0;
        try {
            notaLocal.setNota1(reqNotaDto.getNota1Dto());
            notaLocal.setNota2(reqNotaDto.getNota2Dto());
            notaLocal.setNota3(reqNotaDto.getNota3Dto());
            notaLocal.setNota4(reqNotaDto.getNota4Dto());
            if (0 != suma) {
                suma = notaLocal.getNota1() + notaLocal.getNota2()
                        + notaLocal.getNota3() + notaLocal.getNota4();
                suma = suma / 4;
                notaLocal.setPromedioNotas(suma);
                return notaLocal.getPromedioNotas();

            } else {
                throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
            }
        } catch (NoEncontradoException ex) {
            ex.printStackTrace();
            throw new NoEncontradoException(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
    }

    @Override
    public double agregarNota1(ReqNotaDto reqNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setNota1(reqNotaDto.getNota1Dto());
            return nota.getNota1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);

    }

    @Override
    public double agregarNota2(ReqNotaDto reqNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setNota2(reqNotaDto.getNota2Dto());
            return nota.getNota2();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }

    @Override
    public double agregarNota3(ReqNotaDto reqNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setNota3(reqNotaDto.getNota3Dto());
            return nota.getNota3();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }

    @Override
    public double agregarNota4(ReqNotaDto reqNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setNota4(reqNotaDto.getNota4Dto());
            return nota.getNota4();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }

    @Override
    public double agregarControl1(ReqNotaDto reqNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setControl1(reqNotaDto.getControl1Dto());
            return nota.getControl1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }

    @Override
    public double agregarControl2(ReqNotaDto reqNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setControl2(reqNotaDto.getControl2Dto());
            return nota.getControl2();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }

    @Override
    public double agregarControl3(ReqNotaDto reqNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setControl3(reqNotaDto.getControl3Dto());
            return nota.getControl3();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }

    @Override
    public double agregarControl4(ReqNotaDto reqNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setControl4(reqNotaDto.getControl4Dto());
            return nota.getControl4();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }

    @Override
    public double guardarPromedioNotas(ResponseNotaDto responseNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setPromedioNotas(responseNotaDto.getPromedioNotasDto());
            return nota.getPromedioNotas();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }


    @Override
    public double guardarControlNotas(ResponseNotaDto responseNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setPromedioControles(responseNotaDto.getPromedioControlesDto());
            return nota.getPromedioControles();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }

}
