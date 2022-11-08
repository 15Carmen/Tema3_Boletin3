package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    /*
    Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1 = 120.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int num;
        double factorial=1;
        String cadenaFactorial = "";

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero para calcular su factorial
        System.out.println("Introduzca un numero entero positivo: ");
        num = sc.nextInt();

        if (num>0){
            for (int i = num; i > 0; i--) {

                cadenaFactorial+=i;
                if (i>1){
                    cadenaFactorial+="x";
                }

                factorial=factorial*i;
            }
            System.out.println(cadenaFactorial + " = " + factorial);
        }else {
            System.out.println("Te he pedidio un numero positivo imbecil");
        }

        //Cerramos el scanner
        sc.close();

    }
}
