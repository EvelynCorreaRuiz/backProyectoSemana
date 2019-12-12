package com.proyectoSemana.imp;

import com.proyectoSemana.service.IGradesService;

public class GradesImp implements IGradesService {
    private int suma;
    private int sumacontrol;
    @Override
    public int SumarNotas(int nota1, int nota2, int nota3, int nota4) {

       try{
            this.suma = nota1 + nota2 + nota3 + nota4;

        }catch(Exception ex){
            ex.printStackTrace();
        }
     return this.suma;
    }

    @Override
    public int Promedio(int suma) {
        try{if(suma != 0){
            this.suma = suma / 4;
        }
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return this.suma;
    }

    @Override
    public int SumarControles(int control1, int control2, int control3, int control4) {
        try{
            this.sumacontrol = control1 + control2 +control3 + control4;

        }catch(Exception e){
            e.printStackTrace();
        }
        return this.sumacontrol;
    }

    @Override
    public int PromedioControles(int SumarControles) {
        try{if(SumarControles != 0){
            this.sumacontrol = sumacontrol/ 4;
        }
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return this.sumacontrol;
    }
    }

