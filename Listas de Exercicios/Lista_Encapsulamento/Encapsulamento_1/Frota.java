import java.util.Scanner;

public class Frota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro c1 = new Carro(10.0);

        System.out.println("Autonomia inicial: " + c1.autonomia() + " km");

        c1.percorrerDistancia(50);
        System.out.println("Quilometragem após viagem: " + c1.getQuilometragem());
        System.out.println("Combustível restante: " + c1.getCombustivel());

        c1.abastecer(5.0);
        System.out.println("Combustível após abastecer: " + c1.getCombustivel());
        System.out.println("Nova autonomia: " + c1.autonomia() + " km");
    }
}
