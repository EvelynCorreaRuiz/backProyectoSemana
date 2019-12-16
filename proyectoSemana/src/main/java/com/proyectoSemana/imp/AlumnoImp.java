package com.proyectoSemana.imp;

import com.proyectoSemana.dto.ReqAlumnoDto;
import com.proyectoSemana.dto.ResponseAlumnoDto;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.mapping.MappingObjetosAlumno;
import com.proyectoSemana.model.*;
import com.proyectoSemana.repository.AlumnoRepository;
import com.proyectoSemana.service.IAlumnoService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AlumnoImp implements IAlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private LoginImp loginImp;

    @Autowired
    private CursoImp cursoImp;

    @Autowired
    private MappingObjetosAlumno mappingObjetosAlumno;

    @Override
    public ResponseAlumnoDto guardarAlumno(ReqAlumnoDto alumno) throws Exception {
        Alumno alumnoLocal;
        ResponseAlumnoDto alumnoDto;
        try {
            Login login = loginImp.buscarPorId(alumno.getId_login());
            Curso curso = cursoImp.buscarCursoPorId(alumno.getId_curso());
            if (null != login && null != curso && alumno.getId_alumnoDto() == null){
                alumnoLocal = alumnoRepository.save(mappingObjetosAlumno.tranformarDtoaModel(alumno, login, curso));
                alumnoDto = mappingObjetosAlumno.transformAlumnoToResponse(alumnoLocal);

            } else {
                throw new NoGuardarException(Constant.ERROR_GUARDAR);
            }
        }catch (NoGuardarException ex){
            ex.printStackTrace();
            throw new NoGuardarException(ex.getMessage());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_GUARDAR);
        }
        return alumnoDto;
    }

    public ResponseAlumnoDto buscarAlumnoPorId(Long idAlumno) throws Exception{
       Alumno alumno = null;
        try{
            alumno = mappingObjetosAlumno.transformarOptionalaModel(alumnoRepository.findById(idAlumno));
            if (null == alumno){
                throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
            }

        }catch(NoEncontradoException ex){
            ex.printStackTrace();
            throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }

        return null;
    }
}
