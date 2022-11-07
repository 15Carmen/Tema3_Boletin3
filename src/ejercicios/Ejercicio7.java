package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    /*
    Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1 = 120.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int num;
        double factorial;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero para calcular su factorial
        System.out.println("Introduzca un numero: ");
        num = sc.nextInt();

        factorial=1;

        for (int i = num; i > 0; i--) {
            factorial=factorial*i;
        }
        System.out.println("\nEl factorial de " + num + " es: " + factorial);

        //Cerramos el scanner
        sc.close();

    }
}
