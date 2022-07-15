
/*Cree una clase llamada “Principal” y defina un método en el cual se pase como
parametro un número, el método debe realizar el proceso para verificar si este
número es positivo o negativo, adicionalmete debe devolver true si es positivo o
sino false. En el método main se debe utilizar el método creado para imprimir los
resultados. */
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try {
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            number = sc.nextInt();
            sc.close();
            System.out.println("El número " + number + " es " + isPositive(number));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
}
