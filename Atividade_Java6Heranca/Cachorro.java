package Atividade_Java6Heranca;

public class Cachorro extends Questao1base {
	
	private boolean  correr;
	
	public Cachorro(String nome, String idade, String som,  boolean correr) 
	{
	super(nome,idade,som);
	this.correr = correr;
	}
	
	public boolean isCorrer() {
		return correr;
	}
		
	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

	public void imprimirInfo ()
	
	{	System.out.println("\n*****DADOS DO CACHORRO*****\n Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: "+getSom());
	}
		
	public  void  imprimirMovimento()
	{
		if (isCorrer()==true)
		{
			System.out.println("Gosta de brincar de correr");
		}
	}
}

