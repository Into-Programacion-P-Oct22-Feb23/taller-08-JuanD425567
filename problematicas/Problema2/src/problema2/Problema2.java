/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 26;
        int x2 = 2;
        int x3 = 3;
        int x4 = 4;
        int rest2;
        int rest3;
        int rest4;
        int mult2;
        int mult3;
        int mult4;
        int contador;
        String mensaje = "";
        mult2 = num * 2;
        mult3 = num * 3;
        mult4 = num * 4;
        for (contador=0; contador < 25; contador++) {
            mult2 = mult2 - x2;
            mult3 = mult3 - x3;
            mult4 = mult4 - x4;
            num = num - 1;
            mensaje = mensaje + num + "\t" + mult2 + "\t" + mult3 + "\t" + mult4 + "\n";
            
        }
        System.out.println("N°" + "\t" + "x2" + "\t" + "x3" + "\t" + "x4");
        System.out.println(mensaje);
    }
}


