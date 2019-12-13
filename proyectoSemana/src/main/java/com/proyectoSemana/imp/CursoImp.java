package com.proyectoSemana.imp;

import com.proyectoSemana.dto.ReqCursoDto;
import com.proyectoSemana.dto.ResponseCursoDto;
import com.proyectoSemana.repository.CursoRepository;
import com.proyectoSemana.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoImp  implements ICursoService {

    @Autowired
    private CursoRepository cursoRepository;


    @Override
    public ResponseCursoDto guardarCurso(ReqCursoDto reqCursoDto) throws Exception {
        return null;
    }

    @Override
    public boolean validarCurso(ReqCursoDto reqCursoDto) throws Exception {
        return false;
    }
}
