package repaso;

import java.util.Scanner;

public class x {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int numFilas = teclado.nextInt();
        teclado.close();

        for(int i=1, k=numFilas; i<=numFilas; i++, k--){
            for(int j=1; j<=numFilas; j++){

                if(i==j || k==j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
