package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    /*
    Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int nota;
        int suspenso = 0;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca la nota del alumno");
            nota = sc.nextInt();
            if (nota < 5) {
                suspenso++;
            }
        }
        System.out.println("Hay " + suspenso + " suspensos");

        //Cerramos el scanner
        sc.close();
    }
}
