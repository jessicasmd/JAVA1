package Atividade_Java5POO;

public class Questao4base {

		private String nomeFuncionario;
		private String datadeAdmissao;
		private float salario;
		
		public Questao4base (String nomeFuncionario, String datadeAdmissao, float salario)
		{
		this.nomeFuncionario = nomeFuncionario;
		this.datadeAdmissao = datadeAdmissao;
		this.salario = salario;
		}
		public void imprimirInfo()
		{
			System.out.println("\nNome do funcionário: "+nomeFuncionario+
								"\n Data de Admissão: "+datadeAdmissao+
								"\n Salário: "+salario);		
		}
		public String getNomeFuncionario() {
			return nomeFuncionario;
		}
		public void setNomeFuncionario(String nomeFuncionario) {
			this.nomeFuncionario = nomeFuncionario;
		}
		public int getDatadeAdmissao() {
			return datadeAdmissao;
		}
		public void setDatadeAdmissao(int datadeAdmissao) {
			this.datadeAdmissao = datadeAdmissao;
		}
		public float getSalario() {
			return salario;
		}
		public void setSalario(float salario) {
			this.salario = salario;
		}
		
}
