public class Aluno{
	int matricula;
	String nome;
	String cpf;
	String endereco;

	public String toString(){
		return "Matricula: " + matricula + "\n" +
           		"Nome: " + nome + "\n" +
           		"CPF: " + cpf + "\n" +
           		"Endereco: " + endereco;
	}

	public Aluno(int cMatricula, String cNome, String cCpf, String cEndereco){
		matricula = cMatricula;
		nome = cNome;
		cpf = cCpf;
		endereco = cEndereco;
	}
}