package Atividade_Java6Heranca;

public class Cachorro extends Questao1base {
	
private int correr;
	
	public Cachorro(String nome, String idade, String som, int subir, int correr) 
	{
		super(nome, idade, som, subir, correr);
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
		System.out.println("\n*****DADOS DO CACHORRO*****\n Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: "+getSom()+" \n "+getCorrer());
		
	}
	
	
}
}
