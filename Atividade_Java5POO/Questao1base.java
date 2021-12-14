package Atividade_Java5POO;

public class Questao1base {

		private String nomeCliente;
		private float rendaCliente;
		private int idade;
		private float valorCompra;
		
		
		public Questao1base (String nomeCliente, float rendaCliente, int idade, float valorCompra)
		{
			this.nomeCliente = nomeCliente;
			this.rendaCliente = rendaCliente;
			this.idade = idade;
			this.valorCompra = valorCompra;
		}
		
		public void imprimirInfo()
		{
			System.out.println("Nome do cliente: "+nomeCliente+"\n Com a renda de:  "+rendaCliente+
					"\nIdade: "+idade+"\nRealizou compra no valor de: "+valorCompra);
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public float getRendaCliente() {
			return rendaCliente;
		}

		public void setRendaCliente(float rendaCliente) {
			this.rendaCliente = rendaCliente;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public float getValorCompra() {
			return valorCompra;
		}

		public void setValorCompra(float valorCompra) {
			this.valorCompra = valorCompra;
		}

		public void setValorCompra(int valorCompra2) {
			// TODO Auto-generated method stub
			
		}

		public void setValorCompra(int valorCompra2) {
			// TODO Auto-generated method stub
			
		}

		
}
