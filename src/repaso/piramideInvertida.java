package repaso;

import java.util.Scanner;

public class piramideInvertida {
    public static void main(String[] args) {
        int numFilas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero de filas: ");
        numFilas = sc.nextInt();

        for(int numBlancos = 0, numAsteriscos = (numFilas*2)-1; numAsteriscos>0; numBlancos++, numAsteriscos -= 2){

            //Espacios en blanco
            for(int i=0; i < numBlancos; i++){
                System.out.print(" ");
            }

            //Asteriscos
            for(int j=numAsteriscos; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
