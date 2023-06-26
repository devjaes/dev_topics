import javax.swing.JOptionPane;

public class regex_example_2 {

    // registro de un vehiculo con regex
    public static void main(String[] args) {

        String brand;
        String model;
        String year;
        String color;
        String plate;
        String type;
        String price;
        String mileage;
        String cylinder_capacity;
        String transmission;
        String doors;

        // strings para el regex

        String brand_regex = "^[a-zA-Z]{2,}$";
        String model_regex = "^[a-zA-Z]{2,}$";
        String year_regex = "^[0-9]{4}$";
        String color_regex = "^[a-zA-Z]{2,}$";
        String plate_regex = "^[A-Z]{3,4}[-|\\s]?[0-9]{3,4}$";
        String type_regex = "^[a-zA-Z]{2,}$";
        String price_regex = "^[0-9]{3,}$";
        String mileage_regex = "^[0-9]{1,}$";
        String cylinder_capacity_regex = "^[0-9]{3,}$";
        String transmission_regex = "^[a-zA-Z]{6,}$";
        String doors_regex = "^[1-7]{1}$";

        // entrada de datos del vehiculo

        brand = JOptionPane.showInputDialog(null, "Ingresa la marca del vehiculo: ");
        model = JOptionPane.showInputDialog(null, "Ingresa el modelo del vehiculo: ");
        year = JOptionPane.showInputDialog(null, "Ingresa el año del vehiculo: ");
        color = JOptionPane.showInputDialog(null, "Ingresa el color del vehiculo: ");
        plate = JOptionPane.showInputDialog(null, "Ingresa la placa del vehiculo (En mayúsculas): ");
        type = JOptionPane.showInputDialog(null, "Ingresa el tipo de vehiculo: ");
        price = JOptionPane.showInputDialog(null, "Ingresa el precio del vehiculo: ");
        mileage = JOptionPane.showInputDialog(null,
                "Ingresa el kilometraje del vehiculo (Si no tiene kilometraje ingresa 0): ");
        cylinder_capacity = JOptionPane.showInputDialog(null, "Ingresa la capacidad del cilindro del vehiculo: ");
        transmission = JOptionPane.showInputDialog(null,
                "Ingresa el tipo de transmisión del vehiculo (Automática o Manual): ");
        doors = JOptionPane.showInputDialog(null, "Ingresa el número de puertas del vehiculo: ");

        // impresión de datos del vehiculo con regex

        if (brand.matches(brand_regex)) {
            System.out.println("Marca: " + brand);
        } else {
            System.out.println("Marca inválida");
        }

        if (model.matches(model_regex)) {
            System.out.println("Modelo: " + model);
        } else {
            System.out.println("Modelo inválido");
        }

        if (year.matches(year_regex)) {
            System.out.println("Año: " + year);
        } else {
            System.out.println("Año inválido");
        }

        if (color.matches(color_regex)) {
            System.out.println("Color: " + color);
        } else {
            System.out.println("Color inválido");
        }

        if (plate.matches(plate_regex)) {
            System.out.println("Placa: " + plate);
        } else {
            System.out.println("Placa inválida");
        }

        if (type.matches(type_regex)) {
            System.out.println("Tipo: " + type);
        } else {
            System.out.println("Tipo inválido");
        }

        if (price.matches(price_regex)) {
            System.out.println("Precio: $" + price);
        } else {
            System.out.println("Precio inválido");
        }

        if (mileage.matches(mileage_regex)) {
            System.out.println("Kilometraje: " + mileage + " km");
        } else {
            System.out.println("Kilometraje inválido");
        }

        if (cylinder_capacity.matches(cylinder_capacity_regex)) {
            System.out.println("Capacidad del cilindro: " + cylinder_capacity + " cc");
        } else {
            System.out.println("Capacidad del cilindro inválida");
        }

        if (transmission.matches(transmission_regex)) {
            System.out.println("Transmisión: " + transmission);
        } else {
            System.out.println("Transmisión inválida");
        }

        if (doors.matches(doors_regex)) {
            System.out.println("Número de puertas: " + doors);
        } else {
            System.out.println("Número de puertas inválido");
        }

    }

}
