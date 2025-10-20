public class ContaCorrente{
	private String cliente;
	private int numero;
	private int senha;
	private boolean cadSenha = false;
	private Double saldo = 0.0;

	public boolean cadastrarSenha(int senha){
		if(!this.cadSenha){
			this.cadSenha = true;
			this.senha = senha;
			return true;
		}else{
			return false;
		}
	}

	public boolean alterarSenha(int senha, int novaSenha){
		if(this.senha == senha){
			this.senha=novaSenha;
			return true;
		}else{
			return false;
		}
	}

	public boolean debitar(int senha, Double valor){
		if(this.senha == senha){
			this.saldo -= valor;
			return true;
		}else{
			return false;
		}
	}

	public boolean creditar(int senha, Double valor){
		if(this.senha == senha){
			this.saldo += valor;
			return true;
		}else{
			return false;
		}
	}

	public String consultaSaldo(int senha){
		if(this.senha == senha){
			return "Nome: " + cliente + "\nSaldo: " + saldo;
		}else{
			return "SENHA INVALIDA";
		}
	}

	public ContaCorrente(String cliente, int numero){
		this.cliente = cliente;
		this.numero = numero;
	}

	public void setSaldo(Double saldo){
		if(saldo>0.0){
			this.saldo = saldo;
		}else{
			this.saldo = 0.0;
		}
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public Double getSaldo(){
		return this.saldo;
	}

	public int getSenha(){
		return this.senha;
	}

	public int getNumero(){
		return this.numero;
	}
}