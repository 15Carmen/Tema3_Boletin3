package ejercicios;

public class Ejercicio2 {
    /*
    Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello suma de 2 en 2.
     */
    public static void main(String[] args) {
        for (int i = 2; i <= 200; i+=2) {   //Inicializando el bucle en 2, lo terminamos en 200 y lo incrementamos en 2
            System.out.println(i);          //Imprimimos por pantalla los numeros desde 2 hasta el 200
        }
    }
}
