public class Financeiro {
    public static void main(String[] args) {

        // Criando dois boletos
        Boleto b1 = new Boleto(1, "Conta de Luz", 10, 200.0);
        Boleto b2 = new Boleto(2, "Internet", 15, 100.0);

        // Exibindo informações antes do pagamento
        System.out.println("=== ANTES DO PAGAMENTO ===");
        System.out.println(b1.exibir());
        System.out.println("----------------");
        System.out.println(b2.exibir());
        System.out.println("----------------");

        // Tentando pagar o primeiro boleto ANTES do vencimento (com desconto)
        b1.pagar(8, 20.0, 190.0); // dia 8 → não venceu | desconto = 20 | pagou 190

        // Tentando pagar o segundo APÓS o vencimento (com multa)
        b2.pagar(20, 0.0, 110.0); // dia 20 → venceu | sem desconto | pagou 110

        // Exibindo informações depois do pagamento
        System.out.println("\n=== DEPOIS DO PAGAMENTO ===");
        System.out.println(b1.exibir());
        System.out.println("----------------");
        System.out.println(b2.exibir());
    }
}
