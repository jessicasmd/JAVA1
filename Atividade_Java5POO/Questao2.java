package Atividade_Java5POO;

public class Questao2 {
	// 02- Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
	//em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es 
	//deste objeto no console.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Questao2base aviao = new Questao2base("BR500","Rio de Janeiro","S�o Paulo", 10);
		aviao.imprimirInfo();
		System.out.println("\nOBRIGADO PELA PREFER�NCIA!");
	}

}
