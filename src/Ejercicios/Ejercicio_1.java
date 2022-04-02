/*
1-. Escriba un programa que imprima por pantalla cuánto le costará comprar una computadora a un determinado precio 
si sabe que puede conseguir una rebaja del 15%. No olvidar que al precio del artículo se le debe de agregar el IVA. El 
programa deberá permitir digitar el precio de la computadora y deberá de realizar los cálculos correspondientes
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        double rebaja = 0.15;
        double iva = 0.13;
        double precioArticulo = 0.0;
        double precioIva;
        double precioFinal;
        double precioTotal;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite el precio de la computadora: ");
        double P = leer.nextDouble();
        
        precioArticulo = P * iva;
        precioIva = P + precioArticulo;
        precioFinal = precioIva * rebaja;
        precioTotal = precioIva - precioFinal;
        
        System.out.println("El precio de la computadoras es: $" + precioTotal);
    }
}
