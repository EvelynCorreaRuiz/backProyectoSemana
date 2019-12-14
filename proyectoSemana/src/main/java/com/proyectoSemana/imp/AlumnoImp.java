package com.proyectoSemana.imp;

import com.proyectoSemana.dto.ReqAlumnoDto;
import com.proyectoSemana.dto.ResponseAlumnoDto;
import com.proyectoSemana.dto.ResponseNotaDto;
import com.proyectoSemana.model.Nota;
import com.proyectoSemana.service.IAlumnoService;
import com.proyectoSemana.util.Constant;

public class AlumnoImp implements IAlumnoService {

    @Override
    public ResponseAlumnoDto VerNotas(ReqAlumnoDto reqAlumnoDto) throws Exception {
        ResponseNotaDto responseNotaDto;
        Nota notalocal = null;
        try{

        }catch(Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return null;
    }

}
