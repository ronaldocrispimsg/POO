import java.util.Scanner;

public class Slide1At3 {
        public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor do Produto: ");
        float valor = scan.nextFloat();

        float desconto = (float)(10.0 / 100.0) * valor;

        System.out.println("Valor com desconto a vista: " + (valor - desconto) + "\nValor dividido em 3x: " +(valor / 3));
        }
}