package Atividade_Java3;

import java.util.Scanner;

public class Questao2While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner leia = new Scanner(System.in);
			
			int numVariados, somaMedia=0, entradaMedia=0;
			float media;
			
			do
			{
				if(numVariados%3==0)
				{
					somaMedia+=numVariados;
					entradaMedia++;
				}
				
				System.out.println("\n Entre com o valor: ");
				numVariados=leia.nextInt();
				}
			while(numVariados!= 0);
			
			media=(float)somaMedia/entradaMedia;
			System.out.println("\nA média dos números múltiplos de 3 é: "+media);
	}

}
