package com.proyectoSemana.imp;

import com.proyectoSemana.dto.ReqLoginDto;
import com.proyectoSemana.dto.ResponseLoginDto;
import com.proyectoSemana.exception.NoActualizarException;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.exception.NoValidarSesionException;
import com.proyectoSemana.mapping.MappingObjetosLogin;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.repository.LoginRepository;
import com.proyectoSemana.service.ILoginService;
import com.proyectoSemana.service.IPbkdf2EncryptService;
import com.proyectoSemana.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LoginImp implements ILoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private IPbkdf2EncryptService iPbkdf2EncryptService;

    @Autowired
    private MappingObjetosLogin transformarObjetos;

    @Override
    public ResponseLoginDto guardarLogin(ReqLoginDto reqLoginDto) throws Exception {
        ResponseLoginDto responseLoginDto;
        Login login;
        try {
            Login validateEmail = loginRepository.findByEmail(reqLoginDto.getEmailDto());
            if (null == validateEmail && reqLoginDto.getPasswordDto().length() > Constant.ZERO) {
                login = new Login();
                login.setEmail(reqLoginDto.getEmailDto());
                login.setPassword(iPbkdf2EncryptService.generarHashPassword(reqLoginDto.getPasswordDto()));

                responseLoginDto = transformarObjetos.transformarLoginToResponseDto(loginRepository.save(login));
            } else {
                throw new NoGuardarException(Constant.ERROR_GUARDAR);
            }

        } catch (NoGuardarException ex) {
            ex.printStackTrace();
            throw new NoGuardarException(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return responseLoginDto;
    }

    @Override
    public boolean validarSession(ReqLoginDto reqLoginDto) throws Exception {
        Login loginLocal;
        try {
            loginLocal = loginRepository.findByEmail(reqLoginDto.getEmailDto());
            if (null != loginLocal) {
                return iPbkdf2EncryptService.validarPassword(reqLoginDto.getPasswordDto(), loginLocal.getPassword());
            } else {
                throw new NoValidarSesionException(Constant.ERROR_SESSION);
            }

        } catch (NoValidarSesionException ex) {
            ex.printStackTrace();
            throw new NoValidarSesionException(ex.getMessage());

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
    }

    @Override
    public Login buscarPorId(Long id) throws Exception {
        Login loginLocal;
        try {

            loginLocal = transformarObjetos.transformarOptionaLogin(loginRepository.findById(id));
            if (null == loginLocal) {
                throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
            }
        } catch (NoEncontradoException ex) {
            ex.printStackTrace();
            throw new NoEncontradoException(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return loginLocal;
    }

    @Override
    public List<Login> listarLogin() throws Exception {
        List<Login> listLogin = new ArrayList<>();
        try {
            listLogin = loginRepository.findAll();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return listLogin;
    }

    @Override
    public boolean eliminarLogin(Long id) throws Exception {
        try {

            Login loginLocal = transformarObjetos.transformarOptionaLogin(loginRepository.findById(id));
            if (null == loginLocal) {
                throw new NoEncontradoException(Constant.ERROR_NO_ENCONTRADO);
            } else {
                loginRepository.deleteById(id);
                return true;
            }
        } catch (NoEncontradoException ex) {
            ex.printStackTrace();
            throw new NoEncontradoException(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
    }

    @Override
    public ResponseLoginDto actualizarLogin(Long id, ReqLoginDto reqLoginDto) throws Exception {
        ResponseLoginDto responseLoginDto = null;
        try {

            Login login = buscarPorId(id);
            if (null != reqLoginDto && null != reqLoginDto.getEmailDto() && null != reqLoginDto.getPasswordDto()) {
                login.setEmail(reqLoginDto.getEmailDto());
                login.setPassword(iPbkdf2EncryptService.generarHashPassword(reqLoginDto.getPasswordDto()));
                responseLoginDto = transformarObjetos.transformarLoginToResponseDto(loginRepository.save(login));
            } else {
                throw new NoActualizarException(Constant.ERROR_ACTUALIZAR);
            }

        } catch (NoActualizarException ex) {
            ex.printStackTrace();
            throw new NoActualizarException(ex.getMessage());
        } catch (NoEncontradoException ex) {
            ex.printStackTrace();
            throw new NoEncontradoException(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return responseLoginDto;
    }


}
