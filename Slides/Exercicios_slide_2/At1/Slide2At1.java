import java.util.Scanner;

public class Slide2At1 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

    	ContaBancaria contaCorrente = new ContaBancaria();

    	contaCorrente.numero = 123;
    	contaCorrente.saldo = 1000.0;

    	System.out.println("Conta: " + contaCorrente.numero + "\nSaldo: " + contaCorrente.verSaldo());
    	System.out.println("\n\n");

    	System.out.println("\nInforme o valor de saque: ");
    	double saque = scan.nextDouble();
    	contaCorrente.sacar(saque);
    	System.out.println("\nOperação realizada..\nValores atualizados: ");
    	System.out.println("Conta: " + contaCorrente.numero + "\nSaldo: " + contaCorrente.verSaldo());

    	System.out.println("\n\n");
    	
    	System.out.println("\nInforme o valor de deposito: ");
    	double deposito = scan.nextDouble();
    	contaCorrente.depositar(deposito);
    	System.out.println("\nOperação realizada..\nValores atualizados: ");
    	System.out.println("Conta: \n" + contaCorrente.numero + "\nSaldo: " + contaCorrente.verSaldo());

    }
}

