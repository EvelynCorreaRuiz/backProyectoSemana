package com.proyectoSemana.imp;

import com.proyectoSemana.dto.*;
import com.proyectoSemana.exception.NoGuardarException;
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
    public ResponseProfesorDto guardarProfesor(ReqProfesorDto reqProfesorDto, Login login, Curso curso) throws Exception {
        Profesor profesorLocal;
        ResponseProfesorDto responseProfesorDtoLocal;
        try {
            Profesor validateRut = profesorRepository.findByRut(reqProfesorDto.getRut_ProfesorDto());
            Login validateEmail = profesorRepository.findByEmail(reqProfesorDto.getLoginDto().getEmail());
            if (null == validateEmail && null == validateRut) {
                profesorLocal = new Profesor();
                profesorLocal.setApellidoProfesor(reqProfesorDto.getApellido_ProfesorDto());
                profesorLocal.setNombreProfesor(reqProfesorDto.getNombre_ProfesorDto());
                profesorLocal.setRutProfesor(reqProfesorDto.getRut_ProfesorDto());
                profesorLocal.setId_profesor(reqProfesorDto.getIdProfesorDto());
                profesorLocal.setLogin(login);
                profesorLocal.setCurso(curso);

                responseProfesorDtoLocal = mappingObjetosProfesor.transformarModelaDtoResponse(profesorLocal);
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
        return responseProfesorDtoLocal;
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
