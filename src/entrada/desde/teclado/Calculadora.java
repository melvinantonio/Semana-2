package entrada.desde.teclado;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculadora {
    public static void main(String[] args) {
        double cantidad1 = 0, cantidad2 = 0;
        //Crear el objeto leer de las calses correspondientes para obtener los datos
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        try{ //Se uiliza el manejador de errores de lo contrario genera errores
            System.out.println("Ingresar la cantidad 1:");
            //Hace la lectura desde teclado y olo convierte a double
            cantidad1 = Double.parseDouble(leer.readLine());
            System.out.println("Ingresar la cantidad 2:");
            cantidad2 = Double.parseDouble(leer.readLine());
            
            System.out.println("El resultado de la suma es           :" + Calculadora.sumar(cantidad1, cantidad2));
            System.out.println("El resultado de la resta es          : " + Calculadora.restar(cantidad1, cantidad2));
            System.out.println("El resultado de la multiplicacion es : " + Calculadora.multiplicar(cantidad1, cantidad2));
            System.out.println("El resultado de la division es       : " + Calculadora.dividir(cantidad1, cantidad2));
        }catch (Exception e){ //Captura del error
            System.out.println(e.getMessage());
        }
    }
    public static double sumar(double cantidad1, double cantidad2) {
    double suma = cantidad1 + cantidad2;
    return suma;
    }
    public static double restar(double cantidad1, double cantidad2) {
        double resta = cantidad1 - cantidad2;
        return resta; 
    }
    public static double multiplicar(double cantidad1, double cantidad2) {
        double multiplicacion = cantidad1 * cantidad2;
        return multiplicacion;
    }
    public static double dividir(double cantidad1, double cantidad2) {
        double division = cantidad1 / cantidad2;
        return division;
    }
}
