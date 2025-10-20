public class Aluno{
	String nome, result;
	Double nota1;
	Double nota2;

	public Double media(double nota1, double nota2){
		double media = (nota1 + nota2) / 2;
		return media;
	}

	public String resultado(double media){
		if(media>=6){
			result = "APROVADO";
		}

		if(media<6){
			result = "REPROVADO";
		}
		return result;
	}
}