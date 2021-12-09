package Atividade_Java1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner leia = new Scanner (System.in);
		
		double dias,anos,meses,totaldeDias,resp1,resp2;
		
		
		System.out.println("\n Qual o total de dia(s) de nascido? ");
		dias=leia.nextFloat();
		
		resp1 = dias*1 / 30;
		resp2 = resp1 / 12;
				
		System.out.println("\nVocê tem"+resp1+"mes(es) de nascido, equivalente a" +resp2+ "total de " +dias+ " dias de nascido");
		
	}
}
