package functions;


/*
 * Defina una clase llamada “Operaciones” que contenga métodos para el cálculo de
diferentes operaciones con dos números: suma, resta multiplicación y división.
Utilizar métodos en los cuales se utilice parámetros de entrada y valores de retorno
 */
import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que operacion desea realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. División");
        int op = sc.nextInt();
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        sc.close();

        switch (op) {
            case 1:
                System.out.println("La suma es: " + add(num1, num2));
                break;
            case 2:
                System.out.println("La resta es: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicacion es: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("La division es: " + division(num1, num2));
                break;
            default:
                System.out.println("Operacion no valida");
                break;

        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        return num1 / num2;
    }
}
