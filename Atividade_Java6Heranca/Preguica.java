package Atividade_Java6Heranca;

public class Preguica extends Questao1base {
	
	private String subirArvore;
	
	public Preguica (String nome, int idade, String som, String subirArvore) 
	{
		super(nome, idade, som);
		this.subirArvore = subirArvore;
	}

	
	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}


	public void imprimirInfo()
	{
		System.out.println("\n*****DADOS DA PREGUIÇA*****\n Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: "+getSom()+" \n "+getSubirArvore());
		
	}
	
	
}
}
