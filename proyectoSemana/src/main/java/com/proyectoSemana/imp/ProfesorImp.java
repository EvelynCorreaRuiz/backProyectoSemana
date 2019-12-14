package com.proyectoSemana.imp;

import com.proyectoSemana.dto.*;
import com.proyectoSemana.mapping.MappingObjetosProfesor;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.model.Profesor;
import com.proyectoSemana.repository.ProfesorRepository;
import com.proyectoSemana.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;


public class ProfesorImp implements IProfesorService {


    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private CursoImp cursoImp;

    @Autowired
    private LoginImp loginImp;

    @Autowired
    private MappingObjetosProfesor mappingObjetosProfesor;


    @Override
    public ResponseProfesorDto guardarProfesor(ReqProfesorDto reqProfesorDto) throws Exception {
        Profesor profesorLocal;
        try {




        }catch (Exception ex){
            ex.printStackTrace();
        }
        /*
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
         */
        return null;
    }

    @Override
    public ResponseCursoDto crearCurso(ReqProfesorDto reqProfesorDto, ReqCursoDto reqCursoDto) throws Exception {
        return null;
    }

    @Override
    public ResponseCursoDto guardarAsignatura(ReqProfesorDto reqProfesorDto, ReqAsignaturaDto reqAsignaturaDto) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarAlumno(Long id_alumno) throws Exception {
        return false;
    }

    @Override
    public ResponseLoginDto actualizarAlumno(Long id_alumno, ReqAlumnoDto reqAlumnoDto) throws Exception {
        return null;
    }


}
