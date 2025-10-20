public class Fatura{
	int numero;
	String descricao;
	int quantidade;
	Double preco;

	public Double getValorDaFatura(){
		return quantidade * preco;
	}


	public Fatura(int num, String desc, int qtd, Double prec){
		numero = num;
		descricao = desc;
		quantidade = qtd;
		preco = prec;

		if(quantidade < 0){quantidade = 0;}
		if(preco < 0){preco = 0.0;}
	}

}