package Atividade_Java5POO;

public class Questao2base {

	private String nomedoAviao; 
	private String partida;
	private String destino;
	private int satisfacaoCliente;
	
	public Questao2base (String nomedoAviao, String partida, 
						String destino, int satisfacaoCliente)
	{
		this.nomedoAviao = nomedoAviao;
		this.partida = partida;
		this.destino = destino;
		this.satisfacaoCliente = satisfacaoCliente;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nDADOS DO SEU VOO");
		System.out.println("\nNome do Avião: "+nomedoAviao+ "\nLocal de partida:  "+partida+
							"\nLocal de Destino: "+destino+ "\nMédia de satisfação: "+satisfacaoCliente);
	}

	public String getNomedoAviao() {
		return nomedoAviao;
	}

	public void setNomedoAviao(String nomedoAviao) {
		this.nomedoAviao = nomedoAviao;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getSatisfacaoCliente() {
		return satisfacaoCliente;
	}

	public void setSatisfacaoCliente(int satisfacaoCliente) {
		this.satisfacaoCliente = satisfacaoCliente;
	}
	
	
}
