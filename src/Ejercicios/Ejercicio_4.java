/*
4-. Una empresa de venta de computadoras paga a su personal de ventas un salario de $300,00 más una comisión de 
$50,00 por computadora vendida. Diseñar un programa para calcular el salario de un vendedor en un determinado mes, 
conociendo el nº de computadoras vendidas. Al salario devengado se debe de retener el 10% en concepto de renta. Imprimir 
el nombre del vendedor, el salario devengado y la retención de la renta.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        
        int computadoras_vendidas = 0;
        double sueldo = 300;
        double renta = 0.1, retenido = 0, sueldo_total, comision = 50;
        String nombre_vendedor;
                
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del vendedor: ");
        nombre_vendedor = sc.next();
        
        System.out.println("Ingrese el numero de computadoras vendidas: ");
        computadoras_vendidas = sc.nextInt();
                
        
        if(computadoras_vendidas >= 1){
            
            sueldo = (computadoras_vendidas * comision) + sueldo;                
        
            retenido = sueldo * renta;
            sueldo_total = sueldo - retenido;
            
            System.out.println("El nombre del vendedor es: " + nombre_vendedor);
            
            System.out.println("sueldo: " + sueldo_total);
            
            System.out.println("La retencion del 10% en comicion es: " + retenido);
        
        }else if(computadoras_vendidas == 0){
                        
            
            System.out.println("El nombre del vendedor es: " + nombre_vendedor);
            
            System.out.println("sueldo: " + sueldo);
            
            System.out.println("La retencion del 10% en comicion es: " + retenido);
        }

    }
}
