import java.util.Scanner;

public class Banco {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);

            ContaCorrente conta1 = new ContaCorrente("Crispim",71);

            conta1.cadastrarSenha(1123);
            System.out.println("Senha: " + conta1.getSenha());
            conta1.alterarSenha(1123,1234);
            System.out.println("Nova senha: " + conta1.getSenha());

            System.out.println("Deposito: " + conta1.creditar(1234,115.0));
            System.out.println("Saldo: " + conta1.getSaldo());
            System.out.println("Saque: " + conta1.debitar(1234,25.0));
            System.out.println(conta1.consultaSaldo(1235)); // Invalido
            System.out.println(conta1.consultaSaldo(1234)); // Valido

            conta1.setSaldo(1000.0);
            System.out.println("Saldo com get: " + conta1.getSaldo());
        }
}

