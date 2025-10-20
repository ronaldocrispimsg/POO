import java.util.Scanner;

public class Disciplina {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);

            Aluno aluno1 = new Aluno("Crispim",71,6.2);

            System.out.println(aluno1.resultadoFinal());
            aluno1.setMedia(5.9);
            aluno1.setNome("Ronaldo");
            aluno1.setMatricula(12);
            System.out.println(aluno1.resultadoFinal());
            aluno1.setMedia(7.0);
            System.out.println("Nome: " + aluno1.getNome());
            System.out.println("Matricula: " + aluno1.getMatricula());
            System.out.println("Media: " + aluno1.getMedia());
    }
}
