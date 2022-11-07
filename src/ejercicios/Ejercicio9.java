package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    /*
    Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int num;            //Variable donde vamos a guardar el numero introducido por el usuario
        boolean primo=true;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //le pedimos al usuario que introduzca un número y lo guardamos en la variable num
        System.out.println("Introduzca un numero: ");
        num=sc.nextInt();

        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        

    }
}
