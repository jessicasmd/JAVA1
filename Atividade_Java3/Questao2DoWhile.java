package Atividade_Java3;

import java.util.Scanner;

public class Questao2DoWhile {
// 6 -Escrever um programa que receba vários números inteiros no teclado. 
//	E no final imprimir a média dos números múltiplos de 3. Para sair digitar 
//	0(zero).(DO...WHILE)


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int num,cont=0,somaNum=0;
		float media;
		
		System.out.println("\nInforme um número ");
		num=leia.nextInt();
		
		do
		{
			if(num%3==0) 
			{
			cont++;
			somaNum+=num;
			}
			System.out.println("\nInforme um número ");
			num=leia.nextInt();
			
		}while(num!=0);
		
		media=(float)somaNum/cont;
		System.out.printf("\nForam informados %d número(s) múltiplo(s) de 3, sua soma é de %d e sua média é %.2f ",cont,somaNum,media);
	}
}