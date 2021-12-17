package Atividade_Java6Heranca;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {
// 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá 
//	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, 
//	o programa deverá atender as seguintes funcionalidades:

//	Armazenar dados da List
//	Remover dados da list;
//	Atualizar dados da list.
//	Apresentar todos os dados da list.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner leia = new Scanner (System.in);
			
		ArrayList <String> estoque = new ArrayList();
		
		do
		{
			System.out.println("-------------------------------------------");
			System.out.println("\n\t\t --MENU--");
			System.out.println("\n(1) Armazenar um produto no estoque.");
			System.out.println("\n(2) Remover um produto do estoque.");
			System.out.println("\n(3) Atualizar um produto no estoque");
			System.out.println("\n(4) Mostrar todos os produtos");
			System.out.println("\n(0) Sair do programa.");
			System.out.println("\nSelecione uma opção: ");
			System.out.println("-------------------------------------------");
			op=leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nInforme o produto: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nInforme o produto para remoção: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existente.");
				}
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nInforme o produto para atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nInforme o produto para substituição "+verifica+": ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe!!");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nMostrar os produtos do estoqe");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou o programa.");
				
			}
			
		}while(op!=0);

	}

}