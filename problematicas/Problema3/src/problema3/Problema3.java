/*
//Corregido el 14/12/2022 a las 10:17.

 */
package problema3;

/**
 *
 * @author Cococ
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double celsius;
        double fahrenheit = 20;
        String mensaje = "";
        
        for(int indice = 1; indice <=20; indice++) {
            celsius = (double)5/9 *(fahrenheit - 32);
            mensaje = String.format("%s%.0f°F --> °C = 5/9 * (%.0f - 32) = %.2f°C"
                    + "\n", mensaje, fahrenheit, fahrenheit, celsius);
            fahrenheit = fahrenheit + 4;
        }
        System.out.println(mensaje);
    }

}


