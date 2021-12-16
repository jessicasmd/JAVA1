package Atividade_Java6Heranca;

public class Cavalo extends Questao1base{
	private String correr;
	
	public Cavalo (String nome, int idade, String som, String correr) 
	{
		super(nome, idade, som);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n*****DADOS DO CAVALO*****\n Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: "+getSom()+" \n "+getCorrer());
		
	}
}

}
