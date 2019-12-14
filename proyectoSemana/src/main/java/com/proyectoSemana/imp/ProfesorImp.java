package com.proyectoSemana.imp;

import com.proyectoSemana.dto.*;
import com.proyectoSemana.exception.NoValidarSesionException;
import com.proyectoSemana.mapping.MappingObjetosProfesor;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.model.Profesor;
import com.proyectoSemana.repository.ProfesorRepository;
import com.proyectoSemana.service.IProfesorService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;


public class ProfesorImp implements IProfesorService {


    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private CursoImp cursoImp;

    @Autowired
    private LoginImp loginImp;

    @Autowired
    private MappingObjetosProfesor mappingObjetosProfesor;

    @Override
    public boolean validarProfesor(ReqProfesorDto reqProfesorDto) throws Exception {
        Profesor profesorLocal;
        Login loginLocal;
        try {
            profesorLocal = profesorRepository.findByRut(reqProfesorDto.getRut_ProfesorDto());
            loginLocal = profesorRepository.findByEmail(reqProfesorDto.getLoginDto().getEmail());
            if (null !=profesorLocal && null != loginLocal) {
                return true;
            }else {
                throw new NoValidarSesionException(Constant.ERROR_VALIDAR);
            }
        }catch (NoValidarSesionException ex){
            ex.printStackTrace();
            throw new NoValidarSesionException(ex.getMessage());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
    }

    @Override
    public ResponseProfesorDto guardarProfesor(ReqProfesorDto reqProfesorDto) throws Exception {
        return null;
    }

    @Override
    public ResponseCursoDto crearCurso(ReqProfesorDto reqProfesorDto, ReqCursoDto reqCursoDto) throws Exception {
        return null;
    }

    @Override
    public ResponseCursoDto guardarAsignatura(ReqProfesorDto reqProfesorDto, ReqAsignaturaDto reqAsignaturaDto) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarAlumno(Long id_alumno) throws Exception {
        return false;
    }

    @Override
    public ResponseLoginDto actualizarAlumno(Long id_alumno, ReqAlumnoDto reqAlumnoDto) throws Exception {
        return null;
    }


}
