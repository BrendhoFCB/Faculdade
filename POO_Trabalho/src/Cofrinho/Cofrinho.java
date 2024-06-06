package Cofrinho;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cofrinho {	
	private HashMap<Moeda, Double> listaMoedas = new HashMap<>();//Neste map é onde ficará guardado as moedas que o usuário for "colocando" dentro
   
		
	public void adicionarMoeda(Moeda nome, double quantidade) {//Esse método adicione uma moeda no cofrinho com base no nome da moeda e a quantidade especificada pelo usuário
		if(quantidade <= 0) {//Verifica se a quantidade é válida, ou seja maior que zero.
    		System.out.println("Digite um número válido");
    		return;
    	}
		
	     if (listaMoedas.containsKey(nome)) {//Verifica se a moeda já está presente dentro do cofrinho
	        // Se a moeda já existe na lista, atualiza seu valor somando com o novo valor
	    	
	 		double valorAtual = listaMoedas.get(nome);
	    	System.out.println(quantidade + nome.getNome() + "(s)" + "foram adicionados ao seu cofre com sucesso");
	    	double novoValor = quantidade + valorAtual;
	    	listaMoedas.put(nome, novoValor);
	    	nome.setValor(novoValor);
			System.out.println("");

	    	 
	        
	    } else {
	        // Se a moeda não existe na lista, adiciona ela com o novo valor
	    	nome.setValor(quantidade);
	    	listaMoedas.put(nome, quantidade);
	    	System.out.println(quantidade + nome.getNome() + "(s)" + "foram adicionados ao seu cofre com sucesso");
			System.out.println("");

	    }
	}
			
	
	 public void removerMoeda(Moeda moeda, double quantidade) {//Este método remove a moeda e a quantidade escolhida com base nos parâmetros de moeda, que será Dolar, Euro, ou Real. E a quantidade que deseja remover da moeda escolhida 
				if(quantidade <=0){
					System.out.println("Digite uma quantidade acima de 0");
					return;
				}	
				if(listaMoedas.containsKey(moeda)) { //Verifica se dentro do HashMap possui a chave(Dolar, Euro, Real) que usuário digitar para remoção						
					double valorAtual = listaMoedas.get(moeda);
						if(valorAtual < quantidade) {
							System.out.println("ERRO!. Você está tentando remover uma quantidade acima da disponivel");
							System.out.println("");
						}else if(valorAtual == quantidade){
							//Remove todas moedas presentes se a quantidade removida for igual ao valor atual presente do cofrinho.
							listaMoedas.remove(moeda, quantidade);
							moeda.setValor(0);
							System.out.println("Todos os seus " + quantidade + moeda.getNome() + "(s)" + " foram removidos com sucesso");
							System.out.println("");

						}
						else {
							//Remove a quantidade de moedas especificada pelo usuários, presentes dentro da classe/tipo de moeda, também escolhida pelo usuário
							double sub = valorAtual - quantidade;
							listaMoedas.put(moeda, sub);
							System.out.println(quantidade + "" + moeda.getNome()+"(s)"  + " removido com sucesso de sua conta ");
							moeda.setValor(sub);
							System.out.println("");
						}		
				}else {
				System.out.println("Nenhum " + moeda.getNome() + " encontrado em seu cofre para remoção");
				System.out.println("");
				}
		
		}
			
	
	
	public double totalConversor() {//Este método calcula e converte todas as moedas no cofrinho em Real
		double total = 0;
		for(Entry<Moeda, Double> entry : listaMoedas.entrySet()) {
			Moeda moeda = entry.getKey();
			Double qtd = entry.getValue();
			total += moeda.getValorEmReal() * qtd;
		}
		System.out.printf("Valor de todas as moedas convertidas em real: %.2f reais \n \n", total);
		return total;
		
		

	}
			
	
	public void listagemMoedas() {//Esse método lista todas as moedas presentes no cofrinho e seus valores respectivamente
		if(listaMoedas.size() == 0 ) {
			System.out.println("Seu cofre está vázio");
		}else {
			for(Map.Entry<Moeda, Double> entry : listaMoedas.entrySet()) {			
				Moeda moeda = entry.getKey();
				System.out.println(moeda.getNome() + ":" + entry.getValue());
			
		}
		}
		
	}

	public Map<Moeda, Double> getListaMoedas() {
		return listaMoedas;
	}

	public void setListaMoedas(HashMap<Moeda, Double> listaMoedas) {
		this.listaMoedas = listaMoedas;
	}

	
	public void info(Moeda nome) {//Esse método fornece informações específicas sobre determinada moeda
	    for (Map.Entry<Moeda, Double> entry : listaMoedas.entrySet()) {//Percorre o ListaMoedas
	        Moeda moeda = entry.getKey();
	        if (moeda.getNome().equals(nome.getNome())) {
	            moeda.info();
	            return; // Sai do método após encontrar a moeda
	        }
	    }
	    // Se a moeda não for encontrada, exibe um mensagem informado que aquela determinada moeda não está presente dentro do cofrinho
	    System.out.println("Não foi encontrado nenhum " + nome.getNome() + " eu seu cofrinho");
	}

	
		
}
