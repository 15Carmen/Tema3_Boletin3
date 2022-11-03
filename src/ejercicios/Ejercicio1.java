package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    /*
    Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 al n.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int num;    //Variable donde vamos a guardar el numero introducido por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //le pedimos al usuario que introduzca un número y lo guardamos en la variable num
        System.out.println("Introduzca el numero hasta el que desea contar: ");
        num=sc.nextInt();

        for (int i = 1; i <=num ; i++) {    //Inicializando el bucle en 1, lo terminamos en el numero introducido y lo incrementamos en 1
            System.out.println(i);          //Imprimimos por pantalla los numeros desde 1 hasta el numero introducido por el usuario
        }
    }
}
