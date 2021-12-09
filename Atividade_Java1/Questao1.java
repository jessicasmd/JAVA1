package Atividade_Java1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		float idade,meses,dias,totalemDias,anos;
		
		System.out.println("\n Quantos anos você de vida tem? ");
		anos=leia.nextFloat();
		System.out.println("\n Quantos meses de vida você tem? ");
		meses=leia.nextFloat();
		System.out.println(" \n Quantos dias de vida você tem? ");
		dias=leia.nextFloat();
		
		totalemDias= anos*365+meses*30+dias;
				
		System.out.println("\n Você tem " +totalemDias +" dias de vida!!!");
		
	}

}
