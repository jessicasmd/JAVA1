package Atividade_Java3;

import java.util.Scanner;

public class Questao2DoWhile {
// 6 -Escrever um programa que receba v�rios n�meros inteiros no teclado. 
//	E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 
//	0(zero).(DO...WHILE)


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int num,cont=0,somaNum=0;
		float media;
		
		System.out.println("\nInforme um n�mero ");
		num=leia.nextInt();
		
		do
		{
			if(num%3==0) 
			{
			cont++;
			somaNum+=num;
			}
			System.out.println("\nInforme um n�mero ");
			num=leia.nextInt();
			
		}while(num!=0);
		
		media=(float)somaNum/cont;
		System.out.printf("\nForam informados %d n�mero(s) m�ltiplo(s) de 3, sua soma � de %d e sua m�dia � %.2f ",cont,somaNum,media);
	}
}