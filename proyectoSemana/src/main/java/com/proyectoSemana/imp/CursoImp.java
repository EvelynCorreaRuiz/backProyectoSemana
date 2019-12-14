package com.proyectoSemana.imp;

import com.proyectoSemana.dto.ReqCursoDto;
import com.proyectoSemana.dto.ReqProfesorDto;
import com.proyectoSemana.dto.ResponseCursoDto;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.mapping.MappingObjetosCurso;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Profesor;
import com.proyectoSemana.repository.CursoRepository;
import com.proyectoSemana.repository.ProfesorRepository;
import com.proyectoSemana.service.ICursoService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoImp  implements ICursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    /*@Autowired
    private MappingObjetosCurso mappingObjetosCurso;*/



    @Override
    public ResponseCursoDto guardarCurso(ReqProfesorDto reqProfesorDto, ReqCursoDto reqCursoDto) throws Exception {
      /*  ResponseCursoDto responseCursoDtoLocal;
        Curso cursoLocal;
        try {
            Profesor validateRut = profesorRepository.findByRut(reqProfesorDto.getRut_ProfesorDto());
            if (validateRut != null){
                cursoLocal = new Curso();
                cursoLocal.setIdCurso(reqCursoDto.getId_cursoDto());
                cursoLocal.setNombreCurso(reqCursoDto.getNombreCursoDto());

            }else {
                throw new NoGuardarException(Constant.ERROR_GUARDAR);
            }

        }catch (NoGuardarException ex){
            ex.printStackTrace();
            throw new NoGuardarException(ex.getMessage());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }*/
        return null;
    }

    @Override
    public boolean validarCurso(ReqCursoDto reqCursoDto) throws Exception {
        return false;
    }
}
