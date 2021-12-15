package Atividade_Java6Heranca;

public class Questao1base {
	
		private String nome;
		private String idade;
		private String som;
		private int subir;
		private int correr;
			
		
		public Questao1base (String nome, String idade, String som, int subir, int correr)
		
		{
			this.nome=nome;
			this.idade=idade;
			this.som=som;
			this.subir=subir;
			this.correr=correr;		
			
		}
		
		public void imprimirInfo()
		{
			System.out.println("\n Nome:  "+nome+"\nIdade  "+idade+"\nSom: "+som+
					"\nSubiu quantas árvores: "+subir+ "\nCorreu quanto km: "+correr);
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

		public int getSubir() {
			return subir;
		}

		public void setSubir(int subir) {
			this.subir = subir;
		}

		public int getCorrer() {
			return correr;
		}

		public void setCorrer(int correr) {
			this.correr = correr;
		
		
	}
}