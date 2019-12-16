package com.proyectoSemana.imp;

import com.proyectoSemana.dto.*;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.mapping.MappingObjetosProfesor;
import com.proyectoSemana.model.*;
import com.proyectoSemana.repository.ProfesorRepository;
import com.proyectoSemana.service.IProfesorService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorImp implements IProfesorService {


    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private LoginImp loginImp;

    @Autowired
    private CursoImp cursoImp;

    @Autowired
    private MappingObjetosProfesor mappingObjetosProfesor;

    @Override
    public ResponseProfesorDto guardarProfesor(ReqProfesorDto profesorDto) throws Exception {
        Profesor profesorLocal;
        ResponseProfesorDto profesorDtoRes;
        try {
            Login login = loginImp.buscarPorId(profesorDto.getIdLoginDto());
            Curso curso = cursoImp.buscarCursoPorId(profesorDto.getIdCursoDto());
            if (null != login && null != curso && profesorDto.getIdProfesorDto() == null){
                profesorLocal = profesorRepository.save(mappingObjetosProfesor.transformDtoToProfesor(profesorDto, login, curso));
                profesorDtoRes = mappingObjetosProfesor.transformarModelaDtoResponse(profesorLocal);
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
        return profesorDtoRes;
    }

    @Override
    public Profesor buscarProfesorPorId(Long id) throws Exception {
        Profesor profesor = null;
        try {
            profesor = mappingObjetosProfesor.transformarOptionalaProfesor(profesorRepository.findById(id));
            if (null == profesor){
                throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
            }
        }catch (NoEncontradoException ex){
            throw new NoEncontradoException(ex.getMessage());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return profesor;
    }



}
