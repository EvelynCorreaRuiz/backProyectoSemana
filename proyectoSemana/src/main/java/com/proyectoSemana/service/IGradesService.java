package com.proyectoSemana.service;

public interface IGradesService {
    int SumarNotas(int nota1, int nota2, int nota3, int nota4);
    int Promedio(int suma);
    int SumarControles(int control1, int control2, int control3, int control4);
    int PromedioControles(int SumarControles);

}
