package com.proyectoSemana.imp;

import com.proyectoSemana.dto.ReqAlumnoDto;
import com.proyectoSemana.dto.ReqAsignaturaDto;
import com.proyectoSemana.dto.ReqNotaDto;
import com.proyectoSemana.dto.ResponseNotaDto;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.mapping.MappingObjetosNota;
import com.proyectoSemana.model.Alumno;
import com.proyectoSemana.model.Asignatura;
import com.proyectoSemana.model.Nota;
import com.proyectoSemana.repository.NotaRepository;
import com.proyectoSemana.service.INotaService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaImp implements INotaService {

    @Autowired
    private NotaRepository notaRepository;

    @Autowired
    private MappingObjetosNota transformarObjetosN;


    @Override
    public double calcularPromedioNotas(ReqNotaDto reqNotaDto) throws Exception {
        Nota notaLocal = null;
        double suma = 0;
        try {
            notaLocal.setNota1(reqNotaDto.getNota1Dto());
            notaLocal.setNota2(reqNotaDto.getNota2Dto());
            notaLocal.setNota3(reqNotaDto.getNota3Dto());
            notaLocal.setNota4(reqNotaDto.getNota4Dto());
            if (null != notaLocal) {
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
    public double calcularPromedioControles(ReqNotaDto reqNotaDto) throws Exception {
        Nota notaLocal = null;
        double suma = 0;
        try {
            notaLocal.setControl1(reqNotaDto.getControl1Dto());
            notaLocal.setControl2(reqNotaDto.getControl2Dto());
            notaLocal.setControl3(reqNotaDto.getControl3Dto());
            notaLocal.setControl4(reqNotaDto.getControl3Dto());
            if (null != notaLocal) {
                suma = notaLocal.getNota1() + notaLocal.getNota2()
                        + notaLocal.getNota3() + notaLocal.getNota4();
                suma = suma / 4;
                notaLocal.setPromedioControles(suma);
                return notaLocal.getPromedioControles();

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
    public ResponseNotaDto agregarNota1(double nota1, ReqAlumnoDto reqAlumnoDto, ReqAsignaturaDto reqAsignaturaDto) throws Exception {
        ResponseNotaDto notaDtoLocal = null;
        Nota notaLocal = null;
        try {
            Nota validateAlumno = transformarObjetosN.transformarOptionaNota(notaRepository.findByIdAlumno(reqAlumnoDto.getId_alumnoDto()));
            Nota validateAsignatura = transformarObjetosN.transformarOptionaNota(notaRepository.findByIdAsignatura(reqAsignaturaDto.getId_asignaturaDto()));
            if (nota1 != 0 && validateAlumno != null && validateAsignatura != null){
                notaLocal = new Nota();
                notaLocal.setNota1(nota1);
                /*notaLocal.setAlumno();
                notaLocal.setAsignatura();*/
                notaDtoLocal = transformarObjetosN.transformarModelaResponseDtoNota1(notaRepository.save(notaLocal));
            } else {
                throw new NoGuardarException(Constant.ERROR_GUARDAR);
            }
        }catch (NoGuardarException ex){
            ex.printStackTrace();
            throw new NoGuardarException(ex.getMessage());

        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return notaDtoLocal;
    }

    /*@Override
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
    public double guardarPromedioNotas(ReqNotaDto reqNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setPromedioNotas(calcularPromedioNotas(reqNotaDto));
            return nota.getPromedioNotas();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }


    @Override
    public double guardarPromedioControl(ReqNotaDto reqNotaDto) throws Exception {
        Nota nota = null;
        try {
            nota.setPromedioControles(calcularPromedioControles(reqNotaDto));
            return nota.getPromedioControles();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new Exception(Constant.ERROR_GUARDAR);
    }*/

}
