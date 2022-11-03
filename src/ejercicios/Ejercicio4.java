package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int num;            //Variable donde vamos a guardar el numero introducido por el usuario
        int contador = 0;   //Variable donde vamos a guardar el numero de múltiplos de 3

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //le pedimos al usuario que introduzca un número y lo guardamos en la variable num
        System.out.println("Introduzca el numero hasta el que desea contar: ");
        num = sc.nextInt();

        for (int i = 3; i <= num; i += 3) { //Inicializando el bucle en 3, lo terminamos en el numero introducido y lo incrementamos en 3
            contador++;                     //Incrementamos el contador en 1
        }

        //Imprimimos el numero de multiplos de 3
        System.out.println("Hay " + contador + " multiplos de 3 hasta el numero " + num);
    }


}
