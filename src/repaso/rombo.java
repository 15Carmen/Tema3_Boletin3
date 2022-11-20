package repaso;

import java.util.Scanner;

public class rombo {

    public static void main(String[] args) {
        boolean numeroCorrecto = false;
        int numFilasRombos;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce el número de filas (natural e impar): ");
            numFilasRombos = sc.nextInt();
            if(numFilasRombos>0 && numFilasRombos%2!=0){
                numeroCorrecto = true;
            }
        } while (!numeroCorrecto);

        System.out.println("");

        int numFilas = numFilasRombos/2 + 1;

        for(int altura=1;altura<=numFilas;altura++){
            //Blancos
            for(int blancos=1;blancos<=numFilas-altura;blancos++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int asteriscos=1;asteriscos<=(2*altura)-1;asteriscos++){
                System.out.print("*");
            }
            System.out.println("");
        }

        numFilas--;

        for(int altura=1;altura<=numFilas;altura++){
            //Blancos
            for(int blancos=1;blancos<=altura;blancos++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int asteriscos=1;asteriscos<=(numFilas-altura)*2 +1;asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
