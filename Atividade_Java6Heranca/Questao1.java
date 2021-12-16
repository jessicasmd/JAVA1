package  Atividade_Java6Heranca ;

public  class  Questao1 {
// 1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
// 	comportamento (observe a tabela), utilize os seus conhecimentos e distribuição como
// 	características de forma que tudo o que para comum a todos os animais fique na classe Animal:
	
	public  static  void  main ( String [] args ) {
		// TODO stub do método gerado automaticamente
		
		Cachorro cachorro = new Cachorro ("Amora", "1", "Au au au",true);
		cachorro.imprimirInfo();
		cachorro.imprimirMovimento();
				
		Cavalo cavalo =  new  Cavalo ( "Coragem", "5", " Riririri ",true);
		cavalo.imprimirInfo();
		cavalo.imprimirMovimento();
			
		Preguica preguica =  new Preguica( "Lebre ", "10 ", " Zizizizizi ",true);
		preguica.imprimirInfo();
		preguica.imprimirMovimento();
		
	}

		
}


	

