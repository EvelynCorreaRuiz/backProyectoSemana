package com.proyectoSemana.imp;

import com.proyectoSemana.dto.ReqCursoDto;
import com.proyectoSemana.dto.ReqProfesorDto;
import com.proyectoSemana.dto.ResponseCursoDto;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.exception.NoValidarSesionException;
import com.proyectoSemana.mapping.MappingObjetosCurso;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Profesor;
import com.proyectoSemana.repository.CursoRepository;
import com.proyectoSemana.repository.ProfesorRepository;
import com.proyectoSemana.service.ICursoService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoImp implements ICursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private MappingObjetosCurso transformarObjetosC;

    @Autowired
    private ProfesorImp profesorImp;


    @Override
    public ResponseCursoDto guardarCurso(ReqCursoDto reqCursoDto) throws Exception {
        ResponseCursoDto responseCursoDto;
        Curso cursoLocal;
        try {
            Profesor profesor = profesorImp.buscarProfesorPorId(reqCursoDto.getId_profesor());
            List<Profesor> listProfesor = new ArrayList<>();

        }catch (NoGuardarException ex){
            ex.printStackTrace();
            throw new NoGuardarException(ex.getMessage());

        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return null;
    }

    @Override
    public Curso buscarCursoPorId(Long idCurso) throws Exception {
        Curso curso = null;
        try {
            curso = transformarObjetosC.transformOptionalToCurso(cursoRepository.findById(idCurso));
            if (null == curso){
                throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
            }

        }catch (NoEncontradoException ex){
            throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return curso;
    }
}
