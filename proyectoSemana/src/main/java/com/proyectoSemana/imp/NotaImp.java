package com.proyectoSemana.imp;

<<<<<<< HEAD

public class NotaImp {


=======
import com.proyectoSemana.service.INotaService;

public class NotaImp implements INotaService {
    private int promedio;
    @Override
    public int calcularPromedio(int sumaDeNotas) throws Exception {
        try {
            if (sumaDeNotas != 0){
                sumaDeNotas = sumaDeNotas / 4;
                this.promedio = sumaDeNotas;
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return this.promedio;
    }
>>>>>>> 5b571ad96143c1961c88675fd3e12a8883d48a84
}
