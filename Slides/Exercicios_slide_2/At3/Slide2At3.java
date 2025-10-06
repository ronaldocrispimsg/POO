import java.util.Scanner;

public class Slide2At3 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);

            Operacoes operacao = new Operacoes();

            System.out.println("MENU DE OPERACOES\n1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n0 - Sair\n");
            int opt = scan.nextInt();
            double a;
            double b;

            switch(opt){
                case 1: System.out.println("Insira o primeiro numero: ");
                        a = scan.nextDouble();
                        System.out.println("Insira o segundo numero: ");
                        b = scan.nextDouble();
                        System.out.println("Resultado:" + operacao.soma(a,b));
                    break;

                case 2: System.out.println("Insira o primeiro numero: ");
                        a = scan.nextDouble();
                        System.out.println("Insira o segundo numero: ");
                        b = scan.nextDouble();
                        System.out.println("Resultado:" + operacao.subtracao(a,b));
                    break;

                case 3: System.out.println("Insira o primeiro numero: ");
                        a = scan.nextDouble();
                        System.out.println("Insira o segundo numero: ");
                        b = scan.nextDouble();
                        System.out.println("Resultado:" + operacao.multiplicacao(a,b));
                    break;

                case 4: System.out.println("Insira o primeiro numero: ");
                        a = scan.nextDouble();
                        System.out.println("Insira o segundo numero: ");
                        b = scan.nextDouble();
                        System.out.println("Resultado:" + operacao.divisao(a,b));
                    break;

                case 0: System.out.println("Encerrando...");
                    break;

                default: System.out.println("Opcao invalida.");
            }
            
        }
}

