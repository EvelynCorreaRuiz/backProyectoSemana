package com.proyectoSemana.imp;

import com.proyectoSemana.dto.ReqAsignaturaDto;
import com.proyectoSemana.dto.ResponseAsignaturaDto;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.mapping.MappingObjetosAsignatura;
import com.proyectoSemana.model.Asignatura;
import com.proyectoSemana.repository.AsignaturaRepository;
import com.proyectoSemana.service.IAsignaturaService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaImp implements IAsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Autowired
    private MappingObjetosAsignatura mappingObjetosAsignatura;

    @Override
    public ResponseAsignaturaDto guardarAsignatura(ReqAsignaturaDto asignatura) throws Exception {
        Asignatura asignaturaLocal;
        ResponseAsignaturaDto asignaturaDto;
        try {
            if (asignatura.getId_asignaturaDto() == null){
                asignaturaLocal = asignaturaRepository.save(mappingObjetosAsignatura.transformarDtoaModel(asignatura));
                asignaturaDto = mappingObjetosAsignatura.transformarModelaResponse(asignaturaLocal);
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
        return asignaturaDto;
    }

    @Override
    public Asignatura buscarIdAsignatura(Long id) throws Exception {
        Asignatura asignaturaLocal;
        try {
            asignaturaLocal = mappingObjetosAsignatura.transformarOptionalIntoModel(asignaturaRepository.findById(id));
            if (null == asignaturaLocal){
                throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
            }
        }catch (NoEncontradoException ex){
            ex.printStackTrace();
            throw new NoEncontradoException(ex.getMessage());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return asignaturaLocal;
    }


}
