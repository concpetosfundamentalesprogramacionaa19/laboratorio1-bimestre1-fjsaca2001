/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        problema N 2
            resolucion de la ecuacion 
          (x+(y/z))/(x-(y/z))
        */
        String x,y,z;
        double resultado;
        Scanner entrada = new Scanner(System.in);
         // Rcolleccion de datos
        System.out.println("Ingrese el valor de X : ");
        x = entrada.nextLine();
        
        System.out.println("Ingrese el valor de Y : ");
        y = entrada.nextLine();
        
        System.out.println("Ingrese el valor de Z : ");
        z = entrada.nextLine();
        // Cambio de cadena a decimal
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        double c = Double.parseDouble(z);
        // Calculo del resultado
        resultado = (a+(b/c))/(a-(b/c));
        
        // presentacion de los datos
        System.out.printf("El valor de m en base a las variable:\nx = %s\n\ty"
                + " = %s\n\t\tY = %s\nda como resultado:\n\t\t\tm = %.2f"
                ,a,b,c,resultado);
    }
    
}
