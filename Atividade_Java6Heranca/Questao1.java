package  Atividade_Java6Heranca ;

public  class  Questao1 {
// 1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
// 	comportamento (observe a tabela), utilize os seus conhecimentos e distribuição como
// 	características de forma que tudo o que para comum a todos os animais fique na classe Animal:
	
	public  static  void  main ( String [] args ) {
		// TODO stub do método gerado automaticamente
		
		Cachorro1 cachorro = new Cachorro1 ("Amora", "1", "Au au au",true);
		cachorro.imprimirInfo();
		cachorro.imprimirMovimento();
				
		Cavalo1 cavalo =  new  Cavalo1 ( "Coragem", "5", " Riririri ",true);
		cavalo.imprimirInfo();
		cavalo.imprimirMovimento();
			
		Preguica1 preguica =  new Preguica1( "Lebre ", "10 ", " Zizizizizi ",true);
		preguica.imprimirInfo();
		preguica.imprimirMovimento();
		
	}

		
}


	

