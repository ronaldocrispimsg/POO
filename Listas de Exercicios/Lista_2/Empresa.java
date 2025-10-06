import java.util.Scanner;

public class Empresa {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
        	
        	Funcionario[] funcionarios = new Funcionario[3];
        	
        	for(int i = 0; i < 3; i++){
        		
        		funcionarios[i] = new Funcionario();

        		System.out.println("Nome: ");
        		funcionarios[i].nome = scan.nextLine();

        		System.out.println("Horas Trabalhadas: ");
        		funcionarios[i].horasTrabalhadas = scan.nextDouble();

        		System.out.println("Valor da Hora: ");
        		funcionarios[i].valorDaHora = scan.nextDouble();

        		scan.nextLine(); // Limpeza do Buffer
        	}

        	for(int i = 0; i < 3; i++){
        		System.out.println("Nome: " + funcionarios[i].nome);
           		System.out.println("Valor do salario: " + funcionarios[i].salarioFinal(funcionarios[i].horasTrabalhadas, funcionarios[i].valorDaHora));
        	}
        }
}

