package Atividade_Java6Heranca;

public class Preguica extends Questao1base {
	
	private boolean subir;
	
	public Preguica (String nome, String idade, String som, boolean  subir) 
	{
		super(nome,idade,som);
		this.subir = subir;
	}
	
	public boolean isSubirArvore() {
		return subir;
	}
	

	public boolean isSubir() {
		return subir;
	}

	public void setSubir(boolean subir) {
		this.subir = subir;
	}

	public void imprimirInfo()
	{
		System.out.println("\n*****DADOS DA PREGUIÇA*****\n Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: "+getSom());
		
	}
	public void imprimirMovimento()
	{
		if(isSubirArvore()==true) 
		{
			System.out.println("\nSubir em árvores é seu hobby!");
		}
	}
	
	
}

