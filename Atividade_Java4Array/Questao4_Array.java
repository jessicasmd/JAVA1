package Atividade_Java4Array;

import java.util.Scanner;

public class Questao4_Array {
	//4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
	//	(1) somar as duas matrizes 
	//	(2) subtrair a primeira matriz da segunda 
	//	(3) adicionar uma constante as duas matrizes
	//	(4) imprimir as matrizes 
	//	Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o 
	// valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int constante,linha, coluna,op;
		float [][] matriz1= new float [2][2];
		float [][] matriz2= new float [2][2];
		float [][] matriz3= new float [2][2];
	
		for (linha=0; linha<2;linha++)
		{
			for(coluna=0; coluna<2; coluna++)
			{
				System.out.println("Informe o primeiro número: ");
				matriz1[linha][coluna] = leia.nextFloat();
				System.out.println("Informe o segundo número: ");
				matriz2[linha][coluna] = leia.nextFloat();
			}
		}
		do
		{
			System.out.println("\nEscolha a opção: ");
			System.out.println("1 - Somar as duas matrizes.");
			System.out.println("2 - Subtrair a primeira matriz da segunda.");
			System.out.println("3 - Adicionar uma constante as duas matrizes.");
			System.out.println("4 - Imprimir as matrizes.");
			System.out.println("0 - Sair do sistema");
			op=leia.nextInt();
			
			switch(op)
			{
			case 1:
				for (linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matriz3[linha][coluna]= matriz1[linha][coluna] + matriz2[linha][coluna];
								System.out.println("\nSoma das matrizes: "+matriz3[linha][coluna]);
					}
				}
				break;
			case 2:
				for (linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matriz3[linha][coluna]= matriz2[linha][coluna] - matriz1[linha][coluna];
								System.out.println("\nA diferença das matrizes: "+matriz3[linha][coluna]);
					}
				}
				break;
			case 3:
				System.out.println("Digite o valor da constante: ");
				constante=leia.nextInt();
				for (linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matriz1[linha][coluna]+= constante;
						matriz2[linha][coluna]+= constante;
						
								System.out.println("1ª Matriz: "+matriz1[linha][coluna]);
								System.out.println("2ª Matriz: "+matriz2[linha][coluna]);
					}
				}
				break;
			
			case 4: 
				
				for (linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
											
								System.out.println("1ª Matriz: "+matriz1[linha][coluna]);
								System.out.println("2ª Matriz: "+matriz2[linha][coluna]);
					}
				}
				break;
				default:
					System.out.println("OPÇÃO INVÁLIDA OU SAIR DO PROGRAMA");
			}
		}	while(op!=0);
		
				
	}

}
