/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
            problema N 1
            presentar costo y seguro
           
        */
        int horas;
        float total,c_hora;
        double seguro;
        
        Scanner entrada = new Scanner(System.in);
        // Entrada de datos
        
        System.out.println("Ingrese las horas de trabajo : ");
        horas = entrada.nextInt();
        
           
        System.out.println("Ingrese el costo por hora : ");
        c_hora = entrada.nextFloat();

        // calculo del seguro y total
        
        total = horas * c_hora;
        seguro = total * 0.10;
        total -= seguro;
        
        // presentacion de datos
        
        System.out.printf("El Descuento del seguro social es: %.2f",seguro);
        System.out.printf("\nEl total a pagar es: %.2f ",total);
    }
   }
    
