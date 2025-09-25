import java.util.Scanner;

public class Slide1At2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o Valor a ser elevado por 2 e 3: ");
		double num = scan.nextDouble();
		
		double quadrado = Math.pow(num,2);
		double cubo = Math.pow(num,3);

		System.out.println("Resultado\n\n"+ "Valor do quadrado: " + quadrado + "\nValor do Cubo: " + cubo);
	}
}
