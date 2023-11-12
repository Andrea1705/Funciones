/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;

/**
 *
 * @author maria
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Ejercicio 2:
        Crear un vector que contenga el monto de la facturación total de una empresa
        durante un año (de enero a diciembre).
        Informar:
        - la máxima facturación
        - la facturación más baja
        - el promedio de facturación
        
        */
        
       
         
        int[] facturaciones = {150300, 250000, 500500, 568000, 100000, 789000, 334500, 
                                275700, 628200, 444000, 379600, 470000};
        
        
        double promedio = calcularPromedio(facturaciones);
        System.out.println("La facturación promedio del año es: "+ Math.round (promedio)); 
         
 
        int maximo = facturaciones[0];
        
        for (int i = 0; i < facturaciones.length; i++) {

            if (facturaciones[i] > maximo){
                maximo = facturaciones[i]; 
            }
        }
        System.out.println("La máxima facturación es de: "+maximo); 
        
        
        int minimo = facturaciones[0];
        
        for (int i = 0; i < facturaciones.length; i++) {

            if (facturaciones[i] < minimo){
                minimo = facturaciones[i];  
                System.out.println("La mínima facturación es de: "+minimo); 
            }
        }
    }
    
    
    public static double calcularPromedio(int[] facturaciones) {
        
        double sumar = 0;
        
        for (int i = 0; i < facturaciones.length; i ++){
            sumar += facturaciones[i];
        }
           return sumar / facturaciones.length;
    }
}