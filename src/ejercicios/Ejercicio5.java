package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Pedir diez números por teclado y mostrar la media.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int num;            //Variable donde vamos a guardar el numero introducido por el usuario
        int suma = 0;       //Variable donde vamos a guardar la suma de los numeros introducidos por el usuario
        int contador = 0;   //Variable que va a contar cuántos números ha introducido el usuario
        double media;       //Variable donde vamos a calcular la media de los numeros introducidos por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) { //Inicializando el bucle en 1, lo terminamos en 10 y lo incrementamos en 1
            //Le pedimos al usuario que introduzca un número y lo guardamos en la variable num
            System.out.println("Introduzca un número");
            num = sc.nextInt();

            suma+=num;      //Le sumamos el numero introducido a la variable suma
            contador++;     //incrementamos el contador en 1
        }

        //Calculamso la media dividiendo la suma de todos los números introducidos entre la cantidad de numeros
        media=(double) suma/(double) contador;

        //Imprimimos el resultado de la media por consola
        System.out.println("La media de los numeros introducidos es: "+media);
    }
}
