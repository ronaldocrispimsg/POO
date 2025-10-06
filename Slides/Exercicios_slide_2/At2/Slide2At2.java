import java.util.Scanner;

public class Slide2At2 {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);

        	Retangulo geometria = new Retangulo();

        	System.out.println("Informe o comprimento do retangulo: ");
        	geometria.comprimento = scan.nextDouble();
        	System.out.println("Informe a largura do retangulo: ");
        	geometria.largura = scan.nextDouble();

        	System.out.println("Perimetro do retangulo: " + geometria.perimetro(geometria.comprimento, geometria.largura));
        	System.out.println("Area do retangulo: " + geometria.area(geometria.comprimento, geometria.largura));

        }
}

