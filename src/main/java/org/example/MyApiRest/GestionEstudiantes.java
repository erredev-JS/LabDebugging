package org.example.MyApiRest;

import java.util.HashMap;
import java.util.Map;

public class GestionEstudiantes {
    public static void main(String[] args) {
        Map<String, Integer> estudiantes = new HashMap<>();
        estudiantes.put("Ana", 85);
        estudiantes.put("Juan", 90);
        estudiantes.put("Maria", 75);
        estudiantes.put("Pedro", 60);

        System.out.println("Nota media: " + calcularNotaMedia(estudiantes));
    }

    public static double calcularNotaMedia(Map<String, Integer> estudiantes) {
        int suma = 0;
        for (String nombre : estudiantes.keySet()) {
            suma += estudiantes.get(nombre);
        }
        return suma / estudiantes.size(); // Error semántico: División entera
    }
}
