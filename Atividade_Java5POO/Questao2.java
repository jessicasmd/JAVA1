package Atividade_Java5POO;

public class Questao2 {
	// 02- Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
	//em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações 
	//deste objeto no console.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Questao2base aviao = new Questao2base("BR500","Rio de Janeiro","São Paulo", 10);
		aviao.imprimirInfo();
		System.out.println("\nOBRIGADO PELA PREFERÊNCIA!");
	}

}
