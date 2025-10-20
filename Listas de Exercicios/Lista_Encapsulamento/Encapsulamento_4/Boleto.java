public class Boleto{
	private int codigo;
	private String descricao;
	private int diaDeVencimento;
	private Double valor;
	private boolean status = false;

	public Boleto(int codigo, String descricao, int diaDeVencimento, Double valor,){
		this.codigo = codigo;
		this.descricao = descricao;
		this.diaDeVencimento = diaDeVencimento;
		this.valor = valor;
	}

	public boolean pagar(int dia, Double desconto,Double valorPago){

	}
	
	public boolean exibir(){
		if(this.status){
			return this.status;
		}else{
			return "Boleto: despago"
		}
	}

}