package repaso;

import java.util.Scanner;

public class piramideBlancosInversa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int numFilas = teclado.nextInt();
        int numBlancos = (numFilas * 2) - 2;
        teclado.close();

        System.out.println();

        for(int i=1; i<=numFilas ; i++){

            // Asteriscos
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // Blancos
            for(int j=1;j<=numBlancos; j++){
                System.out.print(" ");
            }

            // Asteriscos
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            numBlancos -= 2;
            System.out.println();
        }
    }
}
