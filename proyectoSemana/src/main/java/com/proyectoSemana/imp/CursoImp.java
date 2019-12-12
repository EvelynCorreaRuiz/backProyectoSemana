package com.proyectoSemana.imp;

import com.proyectoSemana.model.Curso;
import com.proyectoSemana.repository.CursoRepository;
import com.proyectoSemana.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoImp  implements ICursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public Curso saveLogin(Curso curso) {
        Curso cursoLocal = null;
        try {
            cursoLocal = cursoRepository.save(curso);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return cursoLocal;
    }


}
