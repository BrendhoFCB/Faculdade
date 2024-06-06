package Cofrinho;

import java.util.Objects;

abstract class Moeda{
	double valor;//Valor da moeda
	public abstract String getNome();//Retorna o nome da moeda
	public abstract double getValorEmReal();//Retorna o valor da moeda em relação a cotação do real
	public abstract double converter();//Método que tem a função de conversão das moedas
	public abstract void info();//Método com a função de fornecer informações específicas sobre determinada moeda
	
	public Moeda() {//Construtor padrão
		
	}
	
	public Moeda(double valor) {//Construtor para receber o valor da moeda
		this.valor = valor;
	}
	
	public double getValor() {//Getter para o valor da moeda
		return valor;
	}
	
	public void setValor(double valor) {//Setter para o valor da moeda
		 this.valor = valor;
	}
	
	
	@Override
	public int hashCode() {//Sobrescreve em cima do método hashCode para calcular o hash baseado no nome da moeda(método getNome())
		return Objects.hash(getNome());
	}
	@Override
	public boolean equals(Object obj) {//Verifica se os objetos são iguais tendo como base o valor da moeda
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda moeda = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(moeda.valor);
	}
	
	
}
