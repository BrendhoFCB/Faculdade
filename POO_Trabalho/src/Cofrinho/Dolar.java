package Cofrinho;

public class Dolar extends Moeda{

	public Dolar() {//Chama o construtor padrão da classe mãe Moeda
		super();
	}
	
	public Dolar(double valor) {// Chama o construtor da classe mãe Moeda, passando o valor fornecido
		super(valor);
	}

	@Override
	public double converter() {//Método que converte o valor do Dólar para Real
		double conversor = valor * 5.12;
		return conversor;//Retorna o valor total convetido em Real
	}

	@Override
	public void info() {
		double valorEmReal = this.valor * this.getValorEmReal();//Calcula o valor do Dólar para Real
		//Imprime todas as informações abaixo
		System.out.println("Quantidade de dólares presentes em seu cofrinho: " + "$"+valor);
		System.out.println("Sua quantidade de dólar(es) em reais: " + "R$"+ valorEmReal);
		System.out.println("Cotação do Dólar Americano hoje: 1 Dólar Americano igual a 5,12 Real Brasileiro \n");
		System.out.println("16 de maio de 2024, 13:00 UTC \n");	
	    System.out.println("História: O Dólar Americano é a moeda oficial dos Estados Unidos desde 1792. Atualmente, é uma das moedas mais influentes e amplamente utilizadas em todo o mundo.");
		System.out.println("");
	}

	@Override
	public String getNome() {//Método com a função de obter o nome da moeda
		return "Dolar";
	}

	public double getValorEmReal() {//Método para obter a cotação do Dólar em relação ao Real
		return 5.12;//Cotação do Dólar para Real
	}

	
	
}
