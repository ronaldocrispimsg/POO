public class ContaBancaria {
        
	int numero;
	double saldo;

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
    	saldo += valor;
    }

    public double verSaldo(){
    	return saldo;
    } 
}

