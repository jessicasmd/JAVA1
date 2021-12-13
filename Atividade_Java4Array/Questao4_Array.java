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
		
		int op;
		float [][] matriz1= new float [2][2];
		float [][] matriz2= new float [2][2];
		float linha, coluna;
		
		System.out.println("\nInforme o dado: ");
		System.out.println("1 - Somar as duas matrizes.");
		System.out.println("2 - Subtrair a primeira matriz da segunda.");
		System.out.println("3 - Adicionar uma constante as duas matrizes.");
		System.out.println("4 - Imprimir as matrizes.");
		op=leia.nextInt();
		
		System.out.println("Informe o primeiro número: ");
		matriz1 = [linha][coluna]leia.nextFloat();
		System.out.println("Informe o segundo número: ");
		matriz2 = [linha][coluna]leia.nextFloat();
		
	}

}
