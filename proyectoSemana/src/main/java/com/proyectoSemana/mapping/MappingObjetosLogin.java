package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ResponseLoginDto;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.util.Constant;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MappingObjetosLogin {

    public Login transformarOptionaLogin(Optional<Login> loginOptional) throws Exception {
        Login login = null;
        try {
            if(loginOptional.isPresent()){
                login = new Login();
                login.setId(loginOptional.get().getId());
                login.setPassword(loginOptional.get().getPassword());
                login.setEmail(loginOptional.get().getEmail());
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return login;
    }

    public ResponseLoginDto transformarLoginToResponseDto(Login login) throws Exception {
        ResponseLoginDto responseLoginDto = null;
        try {
            if(null != login){
                responseLoginDto = new ResponseLoginDto();
                responseLoginDto.setEmailDto(login.getEmail());
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return responseLoginDto;
    }


}
