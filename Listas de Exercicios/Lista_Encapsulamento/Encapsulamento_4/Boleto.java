public class Boleto{
	private int codigo;
	private String descricao;
	private int diaDeVencimento;
	private Double valor;
	private boolean status = false;

	public Boleto(int codigo, String descricao, int diaDeVencimento, Double valor){
		this.codigo = codigo;
		this.descricao = descricao;
		this.diaDeVencimento = diaDeVencimento;
		this.valor = valor;
	}

	public boolean pagar(int dia, Double desconto,Double valorPago){
		if(this.status){
			System.out.println("Boleto ja pago.");
			return false;
		}

		Double valorTemporario = this.valor;

		if(this.diaDeVencimento<dia){ // vencido
			System.out.println("Boleto vencido, aplicando taxa de atraso...");
			valorTemporario += (10.0 / 100.0) * this.valor;
		}else{ // em dia
			System.out.println("Boleto em dia, aplicando taxa desconto...");
			valorTemporario -= (desconto / 100.0) * this.valor;
		}

		if(valorTemporario<=valorPago){ // Se o valor pago e suficiente pra pagar o boleto
				System.out.println("Boleto pago com sucesso.");
				this.valor = valorTemporario;
				this.status = true;
				return true;
			}else{
				System.out.println("ERRO! Valor insuficiente para o pagamento.");
				return false;
			}
	}
	
	public String exibir(){
			return "Codigo: " + this.codigo + 
			"\nDescricao: " + this.descricao + 
			"\nDia de Vencimento: " + this.diaDeVencimento + 
			"\nValor: " + this.valor +
			"\nStatus: " + (this.status ? "Pago" : "Não pago");
	}

}
