package Atividade_Java6Heranca;

public class Questao1 {
// 1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e 
//	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as 
//	características de forma que tudo o que for comum a todos os animais fique na classe Animal: 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Questao1base cachorro = new Questao1base("Amora", "1","Au au au", 0, 20);
		cachorro.imprimirInfo();
		Questao1base cavalo = new Questao1base("Coragem", "5", "Riririri", 0, 30);
		cavalo.imprimirInfo();
		Questao1base preguica = new Questao1base("Lebre", "10", "Zizizizizi", 100,5);
		preguica.imprimirInfo();
		
	}

}
