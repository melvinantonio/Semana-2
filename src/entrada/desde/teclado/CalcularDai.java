package entrada.desde.teclado;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalcularDai {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("$#,###.##");
        Scanner leer = new Scanner(System.in);
        double valorMaquina, valorFlete, valorSeguro;
        System.out.println("Valor de la máquina: ");
        valorMaquina = leer.nextDouble();
        System.out.println("Valor del flete: ");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del Seguro: ");
        valorSeguro = leer.nextDouble();
        
        double valorDai = CalcularDai.obtenerDai(valorMaquina, valorFlete, valorSeguro);
        double valorConIva = CalcularDai.obtenerIva(valorDai);
        
        System.out.println("Valor del Dai: " + valorDai);
        System.out.println("Valor del IVA: " + formato.format(valorConIva));
    }
    public static double obtenerDai(double valorMaquina, double valorFlete, double valorSeguro) {
        double dai = 0;
        dai = (valorMaquina - valorFlete - valorSeguro) * 0.10;
        return dai;
    }
    public static double obtenerIva(double dai) {
        double pagoConIva = 0;
        pagoConIva = dai * 1.13;
        return pagoConIva;
    }
}
