package Atividade_Java6Heranca;

public class Cachorro2 extends Questao2base {
	
	private boolean  correr;
	
	public Cachorro2(String nome, String idade,  boolean correr) 
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
	
	public  String  getSom () {
		return ( " Som: " + super . getSom ());
	}
}
