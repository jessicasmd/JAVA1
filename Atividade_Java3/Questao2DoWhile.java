package Atividade_Java3;

import java.util.Scanner;

public class Questao2DoWhile {
// Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos 
//	indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, 
//	sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2, 
//	se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema 
//	que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
//	o n�mero de pessoas calmas; 
//	o n�mero de mulheres nervosas; 
//	o n�mero de homens agressivos; 
//	o n�mero de outros calmos;
//	o n�mero de pessoas nervosas com mais de 40 anos; 
//	o n�mero de pessoas calmas com menos de 18 anos.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int sexo, idade, temp;
		int pesCal=0,mulNer=0,homAgr=0,outCal=0,pesNerMa40=0,pesCalMe18=0, pessoas=0;

		while(pessoas<150)
		{
			
			System.out.println("\nInforme sua idade: ");
			idade=ler.nextInt();
			System.out.println("\nInforme seu sexo");
			System.out.println("\n1- Feminino");
			System.out.println("\n2- Masculino");
			System.out.println("\n3- Outros");
			sexo=ler.nextInt();
			
			switch(sexo)
			{
				case 1:
					System.out.println("\nVoc� se considera uma pessoa: ");
					System.out.println("\n1- Calma.");
					System.out.println("\n2- Nervosa.");
					System.out.println("\n3- Agressiva.");
					temp=ler.nextInt();
					if(idade<18 && temp==1)
					{
						pesCalMe18++;
						pesCal++;
					}
					else if(idade>40 && temp==2)
					{
						pesNerMa40++;
						mulNer++;
					}
					else if(temp==2)
					{
						mulNer++;
					}
					else if(temp==1)
					{
						pesCal++;
					}
					break;
										
					
				case 2:
					System.out.println("\nVoc� se identifica como uma pessoa: ");
					System.out.println("\n1- Voc� � calmo.");
					System.out.println("\n2- Voc� � nervoso.");
					System.out.println("\n3- Voc� � agressivo.");
					temp=ler.nextInt();
					if(idade<18 && temp==1)
					{
						pesCalMe18++;
						pesCal++;
					}
					else if(temp==3)
					{
						homAgr++;
					}
					else if(idade>40 && temp==2)
					{
						pesNerMa40++;
					}
					else if(temp==1)
					{
						pesCal++;
					}
					break;
					
					
				case 3:
					System.out.println("\nVoc� se identifica como uma pessoa: ");
					System.out.println("\n1- Voc� � calmo.");
					System.out.println("\n2- Voc� � nervoso.");
					System.out.println("\n3- Voc� � agressivo.");
					temp=ler.nextInt();
					if(idade<18 && temp==1)
					{
						pesCalMe18++;
						outCal++;
						pesCal++;
					}
					else if(idade>40 && temp==2)
					{
						pesNerMa40++;
					}
					else if(temp==1)
					{
						outCal++;
						pesCal++;
					}
					break;
					default:
					System.out.println("\nOp��o inv�lida!");			
			}
			pessoas++;
			
		}
		System.out.println("\nO n�mero de pessoas calmas � de "+pesCal);
		System.out.println("\nO n�mero de mulheres nervosas � de "+mulNer);
		System.out.println("\nO n�mero de homens agressivos � de "+homAgr);
		System.out.println("\nO n�mero de outros calmos � de "+outCal);
		System.out.println("\nO n�mero de pessoas nervosas com mais de 40 anos � de "+pesNerMa40);
		System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos � de "+pesCalMe18);
	}
}
