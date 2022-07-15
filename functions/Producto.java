/*Defina una clase llamada “Producto” y cree los atributos que usted considere
necesarios (mínimo 4). Posteriormente crear tres productos diferentes utilizando la
instanciación de objetos. Finalmente imprima los datos de cada uno de los productos
en el método “main”.*/
public class Producto {
    private String nombre;
    private String marca;
    private int precio;
    private int cantidad;

    public Producto(String nombre, String marca, int precio, int cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public static void main(String[] args) {
        try {
            Producto p1 = new Producto("Laptop", "HP", 10000, 10);
            Producto p2 = new Producto("Laptop", "Dell", 12000, 20);
            Producto p3 = new Producto("Laptop", "Lenovo", 13000, 30);
            System.out.printf("Producto#1:\n\nNombre: %s \nMarca: %s \nPrecio: $%d \nCantidad: %d\n\n--------------\n",
                    p1.nombre, p1.marca,
                    p1.precio, p1.cantidad);
            System.out.printf("Producto#2:\n\nNombre: %s \nMarca: %s \nPrecio: $%d \nCantidad: %d\n\n--------------\n",
                    p2.nombre, p2.marca,
                    p2.precio, p2.cantidad);
            System.out.printf("Producto#3:\n\nNombre: %s \nMarca: %s \nPrecio: $%d \nCantidad: %d\n\n--------------",
                    p3.nombre, p3.marca,
                    p3.precio, p3.cantidad);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
