import java.util.Scanner;

public class retoArreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa su número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }


        System.out.print("Al revés: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

      
        int mayor = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor es: " + mayor);

        sc.close();
    }
}