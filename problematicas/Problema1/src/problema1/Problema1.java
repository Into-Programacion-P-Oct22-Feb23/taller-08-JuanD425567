/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre = "";
        String posicion = "";
        int cantidad;
        int edad=0;
        double estatura=0;
        double promedio_estatura;
        double promedio_edad;
        int suma1=0;
        double suma2=0;
        String mensaje2="";
        String mensaje;
        int contador;
        contador= 0;
        mensaje = "";
        System.out.println("Ingrese la cantidad de veces que añadira jugadores");
        cantidad = entrada.nextInt();
        
        while (contador < cantidad) {
            System.out.println("Ingrese nombre del jugador");
            nombre = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Ingrese la posicion del campo");
            posicion = entrada.nextLine();
            System.out.println("Ingreses la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la altura del jugador");
            estatura = entrada.nextDouble();
            suma1= suma1+edad;
            suma2= suma2+estatura;
            mensaje2= mensaje2+edad+"\n";
            contador=contador+1;
            mensaje= mensaje+contador+". "+nombre+" -"+posicion+"-,"+"edad "+edad+","
                    +"estatura "+estatura+"\n";     
        }
        promedio_edad= suma1/cantidad;
        promedio_estatura= suma2/cantidad;
        mensaje=mensaje+"promedio de edad "+promedio_edad+"\n"+"promedio de "
                + "estatura "+promedio_estatura+"\n";
        System.out.println(mensaje);
        System.out.println("Listado de edades");
        System.out.println(mensaje2);
       
                
               
    }

}
