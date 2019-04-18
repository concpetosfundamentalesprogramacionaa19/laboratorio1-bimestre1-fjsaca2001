/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        problema N 3
            calculo de promedio y observacion
        */
        String nota1,nota2,nota3;
        double promedio;
        Scanner entrada = new Scanner(System.in);
         // Rcolleccion de datos
        System.out.println("Ingrese la nota #1 : ");
        nota1 = entrada.nextLine();
        
        System.out.println("Ingrese la nota #2 : ");
        nota2 = entrada.nextLine();
        
        System.out.println("Ingrese la nota #3 : ");
        nota3 = entrada.nextLine();
        // Cambio de cadena a decimal
        double a = Double.parseDouble(nota1);
        double b = Double.parseDouble(nota2);
        double c = Double.parseDouble(nota3);
        // calculo del promedio
        promedio = (a+b+c)/3;
        // Condicion
        String resultado = promedio>=14 ? "SI pasa el año" : "NO pasa el año";
        // Presentacion de datos
        System.out.printf("Su promedio es %.2f por lo tanto Usted: %s",promedio,resultado);
    }
    
}
