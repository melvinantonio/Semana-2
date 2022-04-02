
package Ejemplos;

import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de n1");
        int x = leer.nextInt();
        System.out.println("Ingrese el valor de n2");
        int y = leer.nextInt();
        
        Ejemplo1.Sumar(x, y);
        
        int resta = restar(x, y);
        System.out.println("La resta es: " + resta);
        Ejemplo1.multiplicar(12, 5, "Melvin");
    }

    private static void Sumar(int a, int b) {
        int sumar = a + b;
        System.out.println("La suma es: " + sumar);
    }

    private static int restar(int a, int b) {
        int resta = a - b;
        System.out.println("La resta es: " + resta);
        return resta;
    }

    private static void multiplicar(int a, int b, String melvin) {
        int mul = a * b;
        System.out.println("La multiplicacion es: " + mul);
    }
    
}
