package tema2_debug;

import java.util.Scanner;

public class MiPrograma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        boolean numeroCorrecto = false;

        do {
            System.out.print("Introduzca un número: ");
            numero = sc.nextInt();

            if (numero < 1 || numero > 20) {
                System.out.println("ERR - Solo es posible el rango del 1 al 20");
            } else {
                numeroCorrecto = true;
            }

        } while (!numeroCorrecto);

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }

        sc.close();
    }
}
