import java.util.Scanner;

public class Lista1At3 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Insira o primeiro valor: ");
            int a = scan.nextInt();

            System.out.println("Insira o segudo valor: ");
            int b = scan.nextInt();

            System.out.println("Insira o terceiro valor: ");
            int c = scan.nextInt();

            double delta = (double)(Math.pow(b,2)) - (4 * a * c);

            if(delta < 0){
                System.out.println("Nao ha raizes reais em delta.");
            }else if(delta > 0){
                System.out.println("Delta possui duas ou mais raizes reais.");
            }else if(delta == 0){
                System.out.println("Delta possui uma raiz real.");
            }
        }
}

