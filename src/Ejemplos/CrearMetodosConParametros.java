
package Ejemplos;

public class CrearMetodosConParametros {
    public static void main(String[] args) {
        System.out.println("Metodo void");
        metodoConParametrosVoid(1, 24.34, "Lucas");
        System.out.println("------------------");
        System.out.println("Metodo int");
        metodoConParametrosInt(1);
        System.out.println("------------------");
        System.out.println("Metodo double");
        metodoConParametrosDouble(24.34);
        System.out.println("------------------");
        System.out.println("Metodo string");
        metodoConParametrosString("Lucas");
    }

    private static void metodoConParametrosVoid(int valorInt, double valorDouble, String valorString) {
        System.out.println("Valor int: " + valorInt);
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor string: " + valorString);
    }

    private static int metodoConParametrosInt(int valorInt) {
        System.out.println("El valor int es: " + valorInt);
        return valorInt;
    }

    private static double metodoConParametrosDouble(double valorDouble) {
        System.out.println("El valor double es: " + valorDouble);
        return valorDouble;
    }

    private static String metodoConParametrosString(String valorString) {
        System.out.println("El valor string es: " + valorString);
        return valorString;
    }
}