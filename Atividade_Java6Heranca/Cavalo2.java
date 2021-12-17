package Atividade_Java6Heranca;

public class Cavalo2 extends Questao2base{
	
	private boolean  correr;
	
	public Cavalo2 (String nome, String idade,  boolean correr) 
	{
		super(nome,idade);
		this.correr = correr;
	}
	
	public boolean isCorrer() {
		return correr;
	}
		
	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

	public void imprimirInfo()
	{
		System.out.println("\n*****DADOS DO CAVALO*****\n Nome: "+getNome()+"\n Idade: "+getIdade());
		
	}
	public void imprimirMovimento()
	{
		if(isCorrer()==true) 
		{
			System.out.println("\nFaz competição de corrida!!");
			
		}
		
	}
	
	public String getSom()
	{
		return ( "Som: " +super.getSom());
	}
}


