package com.proyectoSemana.imp;

import com.proyectoSemana.dto.*;
import com.proyectoSemana.mapping.MappingObjetosProfesor;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.model.Profesor;
import com.proyectoSemana.repository.ProfesorRepository;
import com.proyectoSemana.service.IProfesorService;
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
    public ResponseProfesorDto guardarProfesor(ReqProfesorDto reqProfesorDto) throws Exception {
        Profesor profesorLocal;
        ResponseProfesorDto profesorDto;
        try {
            Login login = loginImp.buscarPorId(reqProfesorDto.getIdLoginDto());


        }catch (Exception ex){
            ex.printStackTrace();
        }
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