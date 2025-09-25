import java.util.Scanner;

public class Lista1At2 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Insira o Valor: ");
            int valor = scan.nextInt();

            if(valor >= 1 && valor <=9){
                System.out.println("O valor esta na faixa permitida.");
            }else{
                System.out.println("O valor esta fora da faixa permitida.");
            }
        }
}

