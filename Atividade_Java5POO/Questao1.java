package Atividade_Java5POO;

public class Questao1 {
	// 01- Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, 
	//em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
	//informa��es deste objeto no console.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Questao1base cliente = new Questao1base("Familia41",5000,30, 1500);
		cliente.imprimirInfo();
		System.out.println("\nAUMENTO DA COMPRA E DE SAL�RIO");
		cliente.setRendaCliente(10000);
		cliente.setValorCompra(3000);
		cliente.imprimirInfo();
	}

}
