package Atividade_Java6Heranca;

public class Questao2base {
	
		private String nome;
		private String idade;
		
		
			
		
		public Questao2base (String nome, String idade)
		
		{
			this.nome=nome;
			this.idade=idade;
			
			
		}
		
		public void imprimirInfo()
		{
			System.out.println("\n Nome:  "+nome+"\nIdade  "+idade);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getIdade() {
			return idade;
		}

		public void setIdade(String idade) {
			this.idade = idade;
		}
			
			
	}