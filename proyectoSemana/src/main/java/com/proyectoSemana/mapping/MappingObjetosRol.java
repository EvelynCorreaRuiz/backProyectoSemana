package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqRolDto;
import com.proyectoSemana.dto.ResponseRolDto;
import com.proyectoSemana.model.Rol;
import com.proyectoSemana.util.Constant;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MappingObjetosRol {


    public Rol transformDtoIntoModel(ReqRolDto reqRolDto ) throws Exception {

        Rol rolLocal = null;
        try {
            if(null != reqRolDto){
                rolLocal = new Rol();
                rolLocal.setId(null);
                rolLocal.setTipo(reqRolDto.getTipoRolDto().toUpperCase());
            }

        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return rolLocal;
    }

    public ResponseRolDto transformModelToDto(Rol rol ) throws Exception {
        ResponseRolDto rolLocal = null;
        try {

            if(null != rol){
                rolLocal = new ResponseRolDto();
                rolLocal.setIdDto(rol.getId());
                rolLocal.setTipoRolDto(rol.getTipo());
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return rolLocal;
    }

    public Rol transformOptionalToModel(Optional<Rol> rolOptional ) throws Exception {
        Rol rolLocal = null;
        try {

            if(rolOptional.isPresent()){
                rolLocal = new Rol();
                rolLocal.setId(rolOptional.get().getId());
                rolLocal.setTipo(rolOptional.get().getTipo());
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return rolLocal;
    }
}
