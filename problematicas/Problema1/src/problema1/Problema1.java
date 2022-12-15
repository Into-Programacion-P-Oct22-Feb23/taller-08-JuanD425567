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
        int num;
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String mensaje = "";
        String listaedades = "";
        double sumaedades = 0;
        double promedioedades = 0;
        double sumaestatura = 0;
        double promedioestatura = 0;

        System.out.println("Ingrese el número de veces que se van a ingresar "
                + "datos:");
        num = entrada.nextInt();

        for (int indice = 1; indice <= num; indice++) {
            System.out.println("Ingrese el nombre del jugador:");
            entrada.nextLine();
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo de juego:");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();

            listaedades = listaedades + " " + edad;
            sumaedades = sumaedades + edad;
            promedioedades = sumaedades / num;
            sumaestatura = sumaestatura + estatura;
            promedioestatura = sumaestatura / num;
            mensaje = String.format("%s%d. %s -%s-,edad "
                    + "%d, estatura %.2f\n", mensaje, indice, nombre,
                    posicion, edad, estatura);
        }
        System.out.printf("\nListado de jugadores\n%sListado de edades %s\n"
                + "Promedio de edades: %.2f\nPromedio de estaturas: %.2f\n",
                mensaje, listaedades, promedioedades, promedioestatura);

    }

}
