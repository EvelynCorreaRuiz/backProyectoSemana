package com.proyectoSemana.mapping;

import com.proyectoSemana.dto.ReqAlumnoDto;
import com.proyectoSemana.dto.ResponseAlumnoDto;
import com.proyectoSemana.model.Alumno;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.util.Constant;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MappingObjetosAlumno {

    public Alumno tranformarDtoaModel(ReqAlumnoDto alumnoDto, Login login, Curso curso/*, List<Nota> notaList*/) throws Exception{
        Alumno alumnoLocal = null;
        try {
            alumnoLocal.setNombreAlumno(alumnoDto.getNombre_AlumnoDto());
            alumnoLocal.setApellidoAlumno(alumnoDto.getApellido_AlumnoDto());
            alumnoLocal.setRut(alumnoDto.getRut_AlumnoDto());
            alumnoLocal.setIdAlumno(alumnoDto.getId_alumnoDto());
            alumnoLocal.setCurso(curso);
            alumnoLocal.setLogin(login);
            /*alumnoLocal.setNotaList(notaList);*/
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return alumnoLocal;
    }

    public ResponseAlumnoDto transformAlumnoToResponse(Alumno alumnoLocal) throws Exception{
        ResponseAlumnoDto alumnoDto = null;
        try {
            alumnoDto = new ResponseAlumnoDto();
            alumnoDto.setNombre_AlumnoDto(alumnoLocal.getNombreAlumno());
            alumnoDto.setApellido_AlumnoDto(alumnoLocal.getApellidoAlumno());
            alumnoDto.setRut_AlumnoDto(alumnoLocal.getRut());
        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return alumnoDto;
    }
    public Alumno transformarOptionalaModel(Optional<Alumno> alumnoOptional) throws Exception{
        Alumno alumnoLocal = null;
        try{
            if(alumnoOptional.isPresent()){
                alumnoLocal = new Alumno();
                alumnoLocal.setIdAlumno(alumnoOptional.get().getIdAlumno());
                alumnoLocal.setNombreAlumno(alumnoOptional.get().getNombreAlumno());
                alumnoLocal.setApellidoAlumno(alumnoOptional.get().getApellidoAlumno());
                alumnoLocal.setRut(alumnoOptional.get().getRut());
                alumnoLocal.setLogin(alumnoOptional.get().getLogin());
                alumnoLocal.setCurso(alumnoOptional.get().getCurso());
                alumnoLocal.setNotaList(alumnoOptional.get().getNotaList());
            }

        }catch(Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return alumnoLocal;
    }
}
