package Atividade_Java5POO;

public class Questao3base {

	private String nomedoProduto;
	private float valordoProduto;
	
	public Questao3base (String nomedoProduto,String valordoProduto)
	{
		this.nomedoProduto = nomedoProduto;
		this.valordoProduto = valordoProduto;
	}
	public void imprimirInfo()
	{
		System.out.println("\nO produto escolhido foi: "+nomedoProduto+
							"\nque possui o valor: "+valordoProduto);
	}
	public String getNomedoProduto() {
		return nomedoProduto;
	}
	public void setNomedoProduto(String nomedoProduto) {
		this.nomedoProduto = nomedoProduto;
	}
	public float getValordoProduto() {
		return valordoProduto;
	}
	public void setValordoProduto(float valordoProduto) {
		this.valordoProduto = valordoProduto;
	}
	
	
}
