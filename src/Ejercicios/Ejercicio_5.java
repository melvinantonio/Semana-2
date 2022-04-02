/*
5-. Escriba un programa para calcular el salario bruto de un empleado. Para calcular el salario del empleado debemos de hacer 
los descuentos por llegadas tardías así como la retención de la renta que es el 10% del salario menos el descuento por llegada 
tardía. Debe de crear una fórmula para determinar el salario por minuto y calcular el monto por las llegadas tardías y 
descontarlo al salario, luego debe de descontar el monto de la renta. El programa deberá permitir ingresar el nombre del
empleado, el salario mensual. El programa deberá de imprimir el nombre del empleado, el descuento por llegadas tardías, la 
retención de la renta y finalmente el salario bruto.

 */
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#,###.##");
        
        double salarioMensual, cantidadMinutos;
        String nombreEmpleado;
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.next();
        
        System.out.println("Ingrese el salario del empleado: ");
        salarioMensual = sc.nextDouble();
        
        System.out.println("Ingrese minutos retrazados:");
        cantidadMinutos = sc.nextDouble();
        
        String name = Ejercicio_5.nombreEmpleado(nombreEmpleado);
        System.out.println("El nombre del empleado es: " + name);
        
        double salario = Ejercicio_5.salarioMensual(salarioMensual);
        System.out.println("Su salario es: " + salario);
        
        double minutos = Ejercicio_5.minutosRetrasados(cantidadMinutos);
        System.out.println("Sus minutos descontados equivale ha: $" + formato.format(minutos));
        
        double a, renta, b, salarioBruto;
        a = salario - minutos;
        renta = 0.1;
        b = a * renta;
        salarioBruto = a - b;
        System.out.println("La retencion de la renta del 10% es: $" + formato.format(b));
        System.out.println("El salario bruto es: $" + formato.format(salarioBruto));
        
        
    }
    public static String nombreEmpleado(String nombreEmpleado){
        String name = nombreEmpleado;
        return nombreEmpleado;
    }
    public static double salarioMensual(double salarioMensual){
        double salario = salarioMensual;
        return salarioMensual;
    }
    public static double minutosRetrasados(double minutosRetrasados){
        double cantidadMinutos = minutosRetrasados * 0.020833333;
        return cantidadMinutos;
    }
}
