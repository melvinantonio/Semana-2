package Ejemplos;

public class InteresSimpleMetodoConParametro {
    public static void main(String[] args) {
        double cantidadPrestada, tiempo, tasaDeIntereses;
        cantidadPrestada = 1500.00;
        tiempo =0.75; //9 meses equivalen a 9/12 años = 2/4 ó 0,75
        tasaDeIntereses = 0.08;
        
        double valorInteresSimple = calcularInteresSimple(cantidadPrestada, tiempo, tasaDeIntereses);
        System.out.println("El interes es: $" + valorInteresSimple);
    }

    private static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasaDeIntereses) {
       double interesSimple;
       interesSimple = cantidadPrestada * tiempo * tasaDeIntereses;
       return interesSimple;
    }
}
