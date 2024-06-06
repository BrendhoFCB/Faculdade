package Cofrinho;

public class Libra extends Moeda{

	@Override
	public String getNome() {
		return "Libra";
	}

	@Override
	public double getValorEmReal() {
		return 6.47;
	}

	@Override
	public double converter() {
		double conversor = valor * getValorEmReal();
		return conversor;
	}

	@Override
	public void info() {
		System.out.println("Suas libras esterlinas: " + valor);
		System.out.printf("Suas libras esterlinas em real: %.2f \n", converter());
		System.out.println("História: A libra esterlina era utilizada no século 7, período da Inglaterra anglo-saxã, mas foi só no ano de 928 que Athelstan, primeiro monarca da Inglaterra, a adotou como primeira moeda oficial");
		
	}

}
