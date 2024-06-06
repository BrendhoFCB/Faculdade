package Cofrinho;

public class Real extends Moeda{
	
	public Real() {//Chama o construtor padrão da classe mãe Moeda
		super();
	}
	
	public Real(double valor) {// Chama o construtor da classe mãe Moeda, passando o valor fornecido
		super(valor);
	}

	@Override
	public double converter() {//Como o Real já é a moeda base, não há a necessidade de conversão. Então a unica função deste método será retornar o valor do real
		return valor;//Retorna o valor do Real
	}
	
	
	@Override 
	public void info() {
		//Imprime todas as informações abaixo
		System.out.println("Quantidade de reais presentes em seu cofrinho: " + valor);
	    System.out.println("História: O Real é a moeda oficial do Brasil desde 1994, substituindo o Cruzeiro. Foi criado como parte do Plano Real para estabilizar a economia do país e controlar a inflação.");
		System.out.println("");	
	}

	@Override
	public String getNome() {
		//Método com a função de obter o nome da moeda
		return "Real";
	}
	
	public double getValorEmReal() {//Método para obter a cotação do Dólar em relação ao Real
		return 1.0;//Por ser a moeda base, a cotação do Real sempre em relação a ele
	}


	
}
