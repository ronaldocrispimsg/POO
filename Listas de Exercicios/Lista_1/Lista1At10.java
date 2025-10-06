import java.util.Scanner;

public class Lista1At10 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
        
            System.out.println("Insira a nota Trab.Laboratorio: ");
            float nota1 = scan.nextFloat();

            System.out.println("Insira a nota Av.Semestral: ");
            float nota2 = scan.nextFloat();

            System.out.println("Insira a nota Ex.Final: ");
            float nota3 = scan.nextFloat();

            float mediaPonderada = (nota1 * 2) + (nota2 * 3) + (nota3 * 5) / (2 + 3 + 5);

            if(mediaPonderada >= 8.0 && mediaPonderada <= 10.0){
                System.out.println("Boletim A");
            }
            if(mediaPonderada >= 7.0 && mediaPonderada < 8.0){
                System.out.println("Boletim B");
            }
            if(mediaPonderada >= 6.0 && mediaPonderada < 7.0){
                System.out.println("Boletim C");
            }
            if(mediaPonderada >= 5.0 && mediaPonderada < 6.0){
                System.out.println("Boletim D");
            }
            if(mediaPonderada >= 0.0 && mediaPonderada < 5.0){
                System.out.println("Boletim E");
            }

            System.out.println("Media Final: " + mediaPonderada);
        }
}

