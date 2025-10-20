import java.util.Scanner;

public class TesteAluno {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            
            Aluno aluno1 = new Aluno(1, "Crispim", "123.456.789-10", "Casa 45");
            Aluno aluno2 = new Aluno(2, "Manu", "321.456.987-11", "Casa 45");

            System.out.println("Cadastro Aluno 1\n" + aluno1.toString() + "\n");
            System.out.println("Cadastro Aluno 2\n" + aluno2.toString());
        }
}

