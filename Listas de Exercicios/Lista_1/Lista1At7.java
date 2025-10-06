import java.util.Scanner;

public class Lista1At7 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Insira o valor: ");
            int valor1 = scan.nextInt();

            System.out.println("Insira o valor: ");
            int valor2 = scan.nextInt();

            System.out.println("Insira o valor: ");
            int valor3 = scan.nextInt();    
            

            if(valor1 > valor2 && valor1 > valor3){
                System.out.println("Valor 1 o maior numero: " + valor1);
            }

            if(valor2 > valor1 && valor2 > valor3){
                System.out.println("Valor 2 o maior numero: " + valor2);
            }

            if(valor3 > valor1 && valor3 > valor2){
                System.out.println("Valor 3 o maior numero: " + valor3);
            }
    }
}

