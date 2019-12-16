package com.proyectoSemana.imp;

import com.proyectoSemana.dto.*;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.mapping.MappingObjetosAsignatura;
import com.proyectoSemana.mapping.MappingObjetosNota;
import com.proyectoSemana.model.Alumno;
import com.proyectoSemana.model.Asignatura;
import com.proyectoSemana.model.Nota;
import com.proyectoSemana.repository.AlumnoRepository;
import com.proyectoSemana.repository.AsignaturaRepository;
import com.proyectoSemana.repository.NotaRepository;
import com.proyectoSemana.service.INotaService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotaImp implements INotaService {

    @Autowired
    private NotaRepository notaRepository;

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private MappingObjetosNota transformarObjetosN;

    @Autowired



    @Override
    public ResponseNotaDto agregarNotas(ReqNotaAlumnoAsignaturaDto reqNotaAlumnoAsignaturaDto) throws Exception {
        ResponseNotaDto notaDtoLocal = null;
        Nota notaLocal = null;
        try {
            Alumno alumno = alumnoRepository.findByRut(reqNotaAlumnoAsignaturaDto.getRutDto());
            Asignatura asignatura = asignaturaRepository.findByNombreAsignatura(reqNotaAlumnoAsignaturaDto.getNombreAsignaturaCursoDto());
            if (null != reqNotaAlumnoAsignaturaDto){
                notaLocal = new Nota();
                notaLocal.setNota1(reqNotaAlumnoAsignaturaDto.getNota1Dto());
                notaLocal.setNota2(reqNotaAlumnoAsignaturaDto.getNota2Dto());
                notaLocal.setNota3(reqNotaAlumnoAsignaturaDto.getNota3Dto());
                notaLocal.setNota4(reqNotaAlumnoAsignaturaDto.getNota4Dto());
                notaLocal.setControl1(reqNotaAlumnoAsignaturaDto.getControl1Dto());
                notaLocal.setControl2(reqNotaAlumnoAsignaturaDto.getControl2Dto());
                notaLocal.setControl3(reqNotaAlumnoAsignaturaDto.getControl3Dto());
                notaLocal.setControl4(reqNotaAlumnoAsignaturaDto.getControl4Dto());
                notaLocal.setPromedioNotas(reqNotaAlumnoAsignaturaDto.getPromedioNotasDto());
                notaLocal.setPromedioControles(reqNotaAlumnoAsignaturaDto.getPromedioControlesDto());
                notaLocal.setAlumno(alumno);
                notaLocal.setAsignatura(asignatura);
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
}
