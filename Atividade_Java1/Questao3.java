package Atividade_Java1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int horas, minutos, segundos , dia, duracao1, duracao2, duracao3;
				
		System.out.print("\nQuantos dia(s) de duração? ");
		dia=leia.nextInt();
		
		duracao1= dia*24;
		duracao2= duracao1*60;
		duracao3= duracao2*60;
		
		System.out.print("\nLogo o evento durou "+duracao1+ " horas,\nEquivalente em " +duracao2+ " minutos \nEquivalente em " +duracao3+ " segundo ");
		
		}

}
