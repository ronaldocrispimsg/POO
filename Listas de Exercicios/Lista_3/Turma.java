import java.util.Scanner;

public class Turma {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            
            Aluno aluno1 = new Aluno();
            Aluno aluno2 = new Aluno();

            System.out.println("Insira as nota 1:");
            aluno1.nota1 = scan.nextDouble();
            System.out.println("Insira as nota 2:");
            aluno1.nota2 = scan.nextDouble();

            System.out.println("Insira as nota 1:");
            aluno2.nota1 = scan.nextDouble();
            System.out.println("Insira as nota 2:");
            aluno2.nota2 = scan.nextDouble();


            System.out.println("Media aluno 1: " + aluno1.media(aluno1.nota1, aluno1.nota2));
            System.out.println("Media aluno 2: " + aluno2.media(aluno2.nota1, aluno2.nota2));

            System.out.println("Aluno 1: " + aluno1.resultado(aluno1.media(aluno1.nota1, aluno1.nota2)));
            System.out.println("Aluno 2: " + aluno2.resultado(aluno2.media(aluno2.nota1, aluno2.nota2)));
        }
}

