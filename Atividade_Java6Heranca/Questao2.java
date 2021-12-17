package Atividade_Java6Heranca;

public class Questao2 {
 // 2- Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e 
//	invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro1 cachorro = new Cachorro1 ("Amora", "1", true);
		cachorro.imprimirInfo();
		cachorro.imprimirMovimento();
				
		Cavalo1 cavalo =  new  Cavalo1 ( "Coragem", "5", true);
		cavalo.imprimirInfo();
		cavalo.imprimirMovimento();
			
		Preguica1 preguica =  new Preguica1( "Lebre ", "10 ", true);
		preguica.imprimirInfo();
		preguica.imprimirMovimento();
		
	}
	
	Questao2base [] animais =  nova  Questao2base[ 3 ];
	animais [ 0 ] = cachorro;
	animais [ 1 ] = cavalo;
	animais [ 2 ] = preguiça;
	
	void para (Questao2base animal : animais) {
		Sistema . para fora . println (animal . getSom ());
	}
}
		
}


