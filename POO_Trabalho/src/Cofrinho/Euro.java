package Cofrinho;

public class Euro extends Moeda {

	public Euro() {//Chama o construtor padrão da classe mãe Moeda
		super(); 
	}
	
	public Euro(double valor) {// Chama o construtor da classe mãe Moeda, passando o valor fornecido
		super(valor);
	}


	@Override
	public double converter() {//Método que converte o valor do Euro para Real
		double conversor = valor * getValorEmReal();
		return conversor;//Retorna o valor total convertido em Real
		
	}

	@Override
	public void info() {
		double valorEmReal = this.valor * this.getValorEmReal();//Calcula o valor do Euro para Real
		//Imprime todas as informações abaixo
		System.out.println("Quantidade de euros presentes em seu cofrinho: " + valor);
		System.out.printf("Seus euros em reais: %.2f \n", valorEmReal);
		System.out.println("Cotação do euro hoje: 1 Euro Igual a 5,56 Real Brasileiro");
		System.out.println("16 de maio de 2024, 13:00 UTC");	
		System.out.println("História: Criado em 1999 e introduzido em 2002, o Euro foi concebido para ser uma moeda única em toda a União europeia, e substuir as antigas moedas nacionais dos países europeus \n");
		System.out.println("");

	}

	@Override
	public String getNome() {//Método com a função de obter o nome da moeda
		return "Euro";
	}

	@Override
	public double getValorEmReal() {//Método para obter a cotação do Euro em relação ao Real
		return 5.56;//Cotação do Euro para Real
	}
	
	
	
	
}
