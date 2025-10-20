import java.util.Scanner;

public class TesteFatura {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            
            Fatura fatura1 = new Fatura(1, "RTX 5070", 1, 3895.83);
            Fatura fatura2 = new Fatura(2, "Corsair Vengence DDR5 6000MHZ", 2, 449.89);

            System.out.println("Valor da Fatura 1:" + fatura1.getValorDaFatura());
            System.out.println("Valor da Fatura 2:" + fatura2.getValorDaFatura());
        }
}

