package Atividade_Java3;

import java.util.Scanner;

public class Questao1For {
	// 1-Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in); 
		
		int num;
					
		for (num=1000; num<=1999; num++)
			
			if(num%11 == 5)
			{
				System.out.println("\nNúmero "+num);
			}
	}

}
