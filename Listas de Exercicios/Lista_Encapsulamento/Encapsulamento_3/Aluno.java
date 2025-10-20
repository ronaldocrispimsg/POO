public class Aluno{
	private String nome;
	private int matricula;
	private Double media = 0.0;
	private String situacao;

	public Aluno(String nome, int matricula, Double media){
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
		verificaSituacao();
	}

	private void verificaSituacao(){
		if(media >= 6){
			this.situacao = "APROVADO!";
		}else{
			this.situacao = "REPROVADO!";
		}
	}

	public String resultadoFinal(){
		return "Nome: " + this.nome + "\nMatricula: " + this.matricula + "\nMedia: " + this.media + "\nSituacao: " + this.situacao; 
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setMatricula(int matricula){
		this.matricula = matricula;
	}

	public void setMedia(Double media){
		this.media = media;
		verificaSituacao();
	}

	public String getNome(){
		return this.nome;
	}
	
	public int getMatricula(){
		return this.matricula;
	}

	public Double getMedia(){
		return this.media;
	}
}