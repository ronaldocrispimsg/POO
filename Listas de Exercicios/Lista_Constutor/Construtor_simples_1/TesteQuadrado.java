import java.util.Scanner;

public class TesteQuadrado{
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            
            Quadrado quadrado1 = new Quadrado(2.0);
        Quadrado quadrado2 = new Quadrado(3.0);

        System.out.println("Area do quadrado 1: " + quadrado1.calculaArea(quadrado1.lado));
        System.out.println("Area do quadrado 2: " + quadrado2.calculaArea(quadrado2.lado));
        
        System.out.println("Perimetro do quadrado 1: " + quadrado1.calculaPerimetro(quadrado1.lado));
        System.out.println("Perimetro do quadrado 2: " + quadrado2.calculaPerimetro(quadrado2.lado));
        
        }
}

