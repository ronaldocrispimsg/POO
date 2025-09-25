import java.util.Scanner;

public class Lista1At4 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Insira o valor do primeiro lado: ");
            float a = scan.nextFloat();

            System.out.println("Insira o valor do segundo lado: ");
            float b = scan.nextFloat();

            System.out.println("Insira o valor do terceiro lado: ");
            float c = scan.nextFloat();

            if(((a + b) > c) && ((b + c) > a) && ((a + c) > b)){
                System.out.println("E possivel formar um tringulo.");
            }else{
                System.out.println("Nao e possivel formar um tringulo.");
            }
        }
}