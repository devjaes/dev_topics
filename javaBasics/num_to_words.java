import javax.swing.JOptionPane;

public class num_to_words {
    public static void main(String[] args) {
        int num = 0;
        int reenternumber = 0;
        final String UNITS = "0 cero  ,1 uno   ,2 dos   ,3 tres  ,4 cuatro,5 cinco ,6 seis  ,7 siete ,8 ocho  ,9 nueve ";
        final String TENTS = "1 diez     ,2 veinte   ,3 treinta  ,4 cuarenta ,5 cincuenta,6 sesenta  ,7 setenta  ,8 ochenta  ,9 noventa  ";
        final String tweny = "veinti";
        final String SPECIAL_TENT = "1 once      ,2 doce      ,3 trece     ,4 catorce   ,5 quince    ,6 dieciseis ,7 diecisiete,8 dieciocho ,9 diecinueve";
        String num_S = "";
        String num_word = "";

        do {
            try {

                num = Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Ingresa un número del 0 al 100: ").replaceAll("\"", ""));
                num_S = String.valueOf(num).trim().replaceAll("\"", "");

                if (num_S.length() > 3 || num < 0 || num > 100) {
                    JOptionPane.showMessageDialog(null, "El número es ingresado está fuera del rango de 0 a 100");
                    reenternumber = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar un número de nuevo?", "",
                            JOptionPane.YES_NO_OPTION);
                    continue;
                }

                if (num_S.length() == 1 || num_S.charAt(0) == 0) {
                    num_word = UNITS.substring(UNITS.indexOf(num_S.charAt(0)) + 2, UNITS.indexOf(num_S.charAt(0)) + 8)
                            .trim();
                    JOptionPane.showMessageDialog(null, "El número " + num + " en palabras es: " + num_word);

                } else if (num_S.length() == 2) {

                    if (num_S.charAt(1) == '0') {
                        num_word = TENTS
                                .substring(TENTS.indexOf(num_S.charAt(0)) + 2, TENTS.indexOf(num_S.charAt(0)) + 11)
                                .trim();
                        JOptionPane.showMessageDialog(null,
                                "El número " + num + " en palabras es: " + num_word);

                    } else if (num_S.charAt(0) == '1' && num_S.charAt(1) != '0') {
                        num_word = SPECIAL_TENT.substring(SPECIAL_TENT.indexOf(num_S.charAt(1)) + 2,
                                SPECIAL_TENT.indexOf(num_S.charAt(1)) + 12).trim();
                        JOptionPane.showMessageDialog(null,
                                "El número " + num + " en palabras es: " + num_word);

                    } else if (num_S.charAt(0) == '2' && num_S.charAt(1) != '0') {
                        num_word = tweny + UNITS
                                .substring(UNITS.indexOf(num_S.charAt(1)) + 2, UNITS.indexOf(num_S.charAt(1)) + 8)
                                .trim();
                        JOptionPane.showMessageDialog(null,
                                "El número " + num + " en palabras es: " + num_word);

                    } else {
                        num_word = TENTS
                                .substring(TENTS.indexOf(num_S.charAt(0)) + 2, TENTS.indexOf(num_S.charAt(0)) + 11)
                                .trim() + " y "
                                + UNITS.substring(UNITS.indexOf(num_S.charAt(1)) + 2,
                                        UNITS.indexOf(num_S.charAt(1)) + 8).trim();
                        JOptionPane.showMessageDialog(null,
                                "El número " + num + " en palabras es: " + num_word);

                    }

                } else if (num_S.length() == 3) {
                    JOptionPane.showMessageDialog(null, "El número es cien");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Se debe ingresar un número ");
                reenternumber = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar un número de nuevo?", "",
                        JOptionPane.YES_NO_OPTION);
                continue;

            }

            reenternumber = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar un número de nuevo?", "",
                    JOptionPane.YES_NO_OPTION);

        } while (reenternumber == 0);

    }
}
