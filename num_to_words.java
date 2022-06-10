import javax.swing.JOptionPane;

public class num_to_words {
    public static void main(String[] args) {
        int num = 0;
        int reenternumber = 0;
        final String UNITS[] = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
        final String TENTS[] = { "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
                "noventa" };
        final String SPECIAL_TENT[] = { "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete",
                "dieciocho",
                "diecinueve" };
        String num_S = "";

        do {
            try {

                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número del 0 al 100: "));
                num_S = String.valueOf(num).trim();

                if (num_S.length() > 3 || num < 0 || num > 100) {
                    JOptionPane.showMessageDialog(null, "El número es ingresado está fuera del rango de 0 a 100");
                    reenternumber = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar un número de nuevo?", "",
                            JOptionPane.YES_NO_OPTION);
                    continue;
                }

                if (num_S.length() == 1 || num_S.charAt(0) == 0) {
                    JOptionPane.showMessageDialog(null,
                            "El número" + num + "en palabras es: " + UNITS[num_S.charAt(0) - '0']);

                } else if (num_S.length() == 2) {

                    if (num_S.charAt(1) == '0') {
                        JOptionPane.showMessageDialog(null,
                                "El número" + num + "en palabras es: " + TENTS[num_S.charAt(0) - '0' - 1]);

                    } else if (num_S.charAt(0) == '1' && num_S.charAt(1) != '0') {
                        JOptionPane.showMessageDialog(null,
                                "El número" + num + "en palabras es: " + SPECIAL_TENT[num_S.charAt(1) - '0' - 1]);

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "El número" + num + "en palabras es: " + TENTS[num_S.charAt(0) - '0' - 1] + " y "
                                        + UNITS[num_S.charAt(1) - '0']);

                    }

                } else if (num_S.length() == 3) {
                    JOptionPane.showMessageDialog(null, "El número es cien");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Se debe ingresar un número");
                reenternumber = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar un número de nuevo?", "",
                        JOptionPane.YES_NO_OPTION);
                continue;

            }

            reenternumber = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar un número de nuevo?", "",
                    JOptionPane.YES_NO_OPTION);

        } while (reenternumber == 0);

    }
}
