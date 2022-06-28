public class sucesionfibonacci {
    public static void main(String[] args) {
        // generar una sucesion fibonacci de 10 elemntos y guardarla en un arreglo
        int[] fibonacci = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        // imprimir el arreglo
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i]);
        }

    }
}
