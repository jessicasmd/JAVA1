 package Atividade_Java5POO;

import java.util.Scanner;

public class Questao3 {
	// 03 - Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
	//em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as 
	//informa��es deste objeto no console.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
						
		
		System.out.println("\nEscolha a op��o: ");
		System.out.println("1 - TV 65 polegadas.");
		System.out.println("2 - Iphone 13.");
		System.out.println("3 - Notebook 14 polegadas.");
		System.out.println("0 - Sair do sistema");
		"op"=leia.nextInt();
		
		switch(op)
		{

		case 1:
			System.out.println("\nO valor da TV 65 polegada � R$ 15.000,00 ");
			
			break;
		case 2:
			System.out.println("\n O valor Iphone 13 R$20.000,00");
			break;
		case 3:
			System.out.println("\n O valor Notebook 14 polegadas R$5.000,00");
			break;
			
			Questao3base eletronicos = new Questao3base ("Pagar o valor de acordo com a op��o","op");
			eletronicos.imprimirInfo();
			System.out.println("\nAGRADECEMOS PELA COMPRA");
	}
	}
	}
		
}	
