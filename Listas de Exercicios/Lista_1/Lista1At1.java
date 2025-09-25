import java.util.Scanner;

public class Lista1At1 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Insira o primeiro valor: ");
            int valor1 = scan.nextInt();

            System.out.println("Insira o segundo valor: ");
            int valor2 = scan.nextInt();
            
            if(valor1 > valor2){
                System.out.println("A diferenca do primeiro para o segundo e de: " + (valor1 - valor2));

            }else if(valor2 > valor1){
                System.out.println("A diferenca do segundo para o primeiro e de: " + (valor2 - valor1));

            }else{
                System.out.println("A diferenca do entre os valores e: " + 0);
            }

        }
}