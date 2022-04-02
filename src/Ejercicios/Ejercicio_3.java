/*
Una agencia de ventas de autos paga a su personal de ventas un salario de $800,00 
mas una comision de $170,00 por auto vendido más un 5% del valor de venta. Diseñar 
un programa para calcular el salario de un vendedor en un determinado 
mes, conociendo el nº de automóviles vendidos y el total del monto de ventas. 
Imprimir el nombre del vendedor y el salario devengado por este.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int autos_vendidos = 0;
        double total_ventas = 0;
        double sueldo_total = 0;
        String nombre_vendedor;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor: ");
        nombre_vendedor = sc.next();
        System.out.println("Ingrese el numero de automóviles vendidos: ");
        autos_vendidos = sc.nextInt();
        System.out.println("Ingresa el total del monto de ventas: ");
        total_ventas = sc.nextDouble();
        sueldo_total = 800 + 170 * autos_vendidos + 0.05 * total_ventas;
        System.out.println("El nombre del vendedor es: " + nombre_vendedor);
        System.out.println("El salario del vendedor es: $" + sueldo_total);        
    }
}
