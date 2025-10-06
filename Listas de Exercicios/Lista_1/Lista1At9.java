import java.util.Scanner;

public class Lista1At9 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Insira o valor: ");
            float valor = scan.nextFloat();

            if(valor < 5000){
                float aumento = (float)(30.0 / 100.0) * valor;
                valor += aumento;
            }

            System.out.println("Valor Reajustado: " + valor);
        }
}

