import java.util.Scanner;

public class Slide1At1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Nota 1: ");
		int nota1 = scan.nextInt();
		
		System.out.println("Nota 2: ");
		int nota2 = scan.nextInt();
		
		System.out.println("Nota 3: ");
		int nota3 = scan.nextInt();
		
		int media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Seu nome: " + nome + "\nSua media de notas: " + media);
	}
}

