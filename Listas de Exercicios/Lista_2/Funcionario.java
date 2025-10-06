public class Funcionario{
	String nome;
	Double horasTrabalhadas;
	Double valorDaHora;

	public double salarioFinal(double horasTrabalhadas, double valorDaHora){
		double desconto = (11.0 / 100.0) * (valorDaHora * horasTrabalhadas); 
		return (valorDaHora * horasTrabalhadas) - desconto;
	}
}