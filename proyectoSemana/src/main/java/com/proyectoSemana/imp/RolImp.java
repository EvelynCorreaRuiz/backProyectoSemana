package com.proyectoSemana.imp;

import com.proyectoSemana.dto.ReqRolDto;
import com.proyectoSemana.dto.ResponseRolDto;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.mapping.MappingObjetosRol;
import com.proyectoSemana.model.Rol;
import com.proyectoSemana.repository.RolRepository;
import com.proyectoSemana.service.IRolService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolImp implements IRolService {

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private MappingObjetosRol mappingObjetosRol;

    @Override
    public ResponseRolDto guardarRol(ReqRolDto reqRolDto) throws Exception {
        ResponseRolDto responseRolDto =  null;
        try {
                if(null != reqRolDto.getTipoRolDto() && null != reqRolDto){
                    responseRolDto = mappingObjetosRol.transformModelToDto(rolRepository.save(mappingObjetosRol.transformDtoIntoModel(reqRolDto)));
                }else{
                    throw new NoGuardarException(Constant.ERROR_GUARDAR);
                }

        }catch (NoGuardarException ex){
            ex.printStackTrace();
            throw new NoGuardarException(ex.getMessage());

        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return responseRolDto;
    }

    @Override
    public Rol buscarRolporId(Long id) throws Exception {
        Rol rol =  null;
        try {
             rol = mappingObjetosRol.transformOptionalToModel(rolRepository.findById(id));
             if(null == rol){
                 throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
             }
        }catch (NoEncontradoException ex){
            throw new NoEncontradoException(ex.getMessage());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return rol;
    }


}
