package Atividade_Java6Heranca;

public class Questao1base {
	
		private String nome;
		private String idade;
		private String som;
		
			
		
		public Questao1base (String nome, String idade, String som)
		
		{
			this.nome=nome;
			this.idade=idade;
			this.som=som;
			
		}
		
		public void imprimirInfo()
		{
			System.out.println("\n Nome:  "+nome+"\nIdade  "+idade+"\nSom: "+som);
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

		public String getSom() {
			return som;
		}

		public void setSom(String som) {
			this.som = som;
		}
		
	}