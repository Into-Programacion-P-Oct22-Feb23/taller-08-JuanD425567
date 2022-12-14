/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int v1 = 32;
        double v2 = 5/9;
        int farenheit = 20;
        int contador = 0;
        int limite = 20;
        double celcius;
        String mensaje = "";
        while (contador < limite) {
            celcius = (farenheit-32/(1.8));
            mensaje = mensaje + "ºC= "+ "5/9" +"("+farenheit+"-32"+") "
                    + "= "+celcius + "\n";
            farenheit = farenheit +4;
            contador = contador + 1;
            
        }
        System.out.println(mensaje);
    }

}


//"ºC= "+ "5/9" +"("+farenheit+"-32"+"