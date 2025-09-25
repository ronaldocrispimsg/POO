import java.util.Scanner;

public class Lista1At5 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Insira o primeiro valor:");
            int valor1 = scan.nextInt();

            System.out.println("Insira o segundo valor:");
            int valor2 = scan.nextInt();

            System.out.println("Insira o terceiro valor:");
            int valor3 = scan.nextInt();

            System.out.println("Insira o quarto valor:");
            int valor4 = scan.nextInt();

            int resto = valor1 % 2;
            if(resto == 0){
                System.out.println("Numero divisivel por 2");
            }else{
                System.out.println("Numero nao e divisivel por 2");
            }
            String div3 = String.valueOf(valor1);
            int somaDasCasas = 0;
            for (int i = 0; i < div3.length(); i++) {
                char casaDec = div3.charAt(i);
                somaDasCasas += Character.getNumericValue(casaDec);
            }

            System.out.println("String: " + somaDasCasas); 
        }
}
