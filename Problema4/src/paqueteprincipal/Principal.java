/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
// Imporacion de paquetes y clases
import paquete1.*;
import paquete2.*;
import paquete3.*;
/**
 *
 * @author DELL
 */
public class Principal {
     public static void main(String[] args){
         // Calculo de mayor o menor de edad
         String resultado = Miclase1.edad >= 18 ? "y es mayor de edad ": 
                 "y no es menor de edad"; 
         // Presentacion de datos
         System.out.printf("Nombre:\n\t %s \nApellido:\n\t %s \nEdad:\n\t "
                 + "%d %s" 
         ,Miclase2.nombre,Miclase3.apellido,Miclase1.edad,resultado);
         
     }
}
