package Atividade_Java6Heranca;

public class Preguica2 extends Questao2base {
	
	private boolean subir;
	
	public Preguica2 (String nome, String idade, boolean subir) 
	{
		super(nome,idade);
		this.subir=subir;
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
		System.out.println("\n*****DADOS DA PREGUIÇA*****\n Nome: "+getNome()+"\n Idade: "+getIdade());
		
	}
	public void imprimirMovimento()
	{
		if(isSubirArvore()==true) 
		{
			System.out.println("\nSubir em árvores é seu hobby!");
		}
	}
	public  String  getSom () {
		return ( "Som: " + super . getSom ());
	}
	
}

