package repaso;

import java.util.Scanner;

public class mediaPiramideInvertidaDerecha {
    public static void main(String[] args) {

        int numFilas;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introducir el número de filas: ");
        numFilas = sc.nextInt();

        for(int i = 0, j=numFilas; i<=numFilas; i++, j--){
            for(int blancos = 0; blancos<i; blancos++){
                System.out.print(" ");
            }
            for(int asteriscos = 0; asteriscos<j; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
