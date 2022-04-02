/*
2-. Hacer un programa que calcule el valor del DAI (Derecho Arancelario a la Importación) para un vehículo del año 2010 
utilizando la siguiente fórmula:

DAI = (Valor Vehículo en USA – Depreciación - Flete – Seguro) * 0.25

Depreciación = Valor Vehículo en USA * 0.10

El programa deberá permitir ingresar vía teclado los valores para el valor del vehículo en USA, flete y seguro. Por el momento 
el porcentaje de la depreciación será constante. Para efectos de prueba puede utilizar los siguientes valores:

Valor USA = 5000, Depreciación = 10%, Flete = 700, Seguro = 100. 
Imprimir los valores capturados así como el monto del DAI.
 */
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#,###.##");
        
        Scanner leer = new Scanner(System.in);
        double valorVehiculo, flete, seguro;
        
        System.out.println("Ingrese el valor del vehiculo: $");
        valorVehiculo = leer.nextDouble();
        
        
        System.out.println("Ingrese el valor del flete: ");
        flete = leer.nextDouble();
        
        System.out.println("Ingrese el valor del seguro: ");
        seguro = leer.nextDouble();
        
         double valorDai = Ejercicio_2.valorDai(valorVehiculo, flete, seguro);
         double d = valorVehiculo * 0.10; 
         
        System.out.println("Valor del  veiculo ingresado es:" + valorVehiculo);
        System.out.println("Valor del flete ingresado es: " + flete);
        System.out.println("Valor de seguro es: " + seguro);
        System.out.println("Su valor de depreciacion a descontar es: " + d);
        System.out.println("El Valor DAI es: $" + formato.format(valorDai));
    }

    private static double valorDai(double valorVehiculo, double flete, double seguro) {
        double dai = 0;
        double depreciacion = 0 ;
        depreciacion = valorVehiculo * 0.10;
        dai = (valorVehiculo - depreciacion - flete - seguro) * 0.25;
        return dai;
    }
}
