package Cofrinho;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cofrinho c1 = new Cofrinho();
		Scanner teclado = new Scanner(System.in);
		String nomeMoedaStr;
		int tecladoint;
		Euro euro = new Euro();
		Dolar dolar = new Dolar();
		Real real = new Real();		
		Libra libra = new Libra();
		
	while(true){// Loop infinito para manter o menu em execução até que o usuário escolha parar a execução do programa
			
		try {						
			System.out.println("1.Adicionar Moedas");
			System.out.println("2.Remover Moedas");
			System.out.println("3.Listar Moedas");
			System.out.println("4.Calcular total");
			System.out.println("5.Info da Moeda");
			System.out.println("6.Sair");
			 tecladoint = teclado.nextInt();	
			System.out.println("");

				if(tecladoint >= 1 && tecladoint <= 6 ) {//Verifica se a opção escolhida está entre 1 e 6, que são as opções presentes no menu
					if(tecladoint == 1) {//Entra na opção de adicionar a moeda e sua quantidade ao cofrinho
						System.out.println("Adicione o tipo(Dolar, Euro, Libra Real) e a quantidade: ");
						nomeMoedaStr = teclado.next();
						double qtdMoeda = teclado.nextDouble();				
							if(nomeMoedaStr.equals("Real")) {									
								c1.adicionarMoeda(real, qtdMoeda);	
								
						   }else if(nomeMoedaStr.equals("Euro")){									
								c1.adicionarMoeda(euro, qtdMoeda);
								
						   } else if(nomeMoedaStr.equals("Dolar")) {									
								c1.adicionarMoeda(dolar, qtdMoeda);

						   } else if(nomeMoedaStr.equals("Libra")) {
							   c1.adicionarMoeda(libra, qtdMoeda);
						   }
							
					}else if(tecladoint == 2 ) {//Entra na opção de remover a moeda
								System.out.println("Digite o tipo e quantidade que deseja remover");
								String	nomeStr = teclado.next();
								double qtd = teclado.nextDouble();
								if(nomeStr.equals("Real")) {									
									c1.removerMoeda(real, qtd);								
													
								}else if(nomeStr.equals("Euro")) {
									c1.removerMoeda(euro, qtd);
											
								}else if(nomeStr.equals("Dolar")) {
									c1.removerMoeda(dolar, qtd);
									
								}else if(nomeStr.equals("Libra")){
									c1.removerMoeda(libra, qtd);
								}
									
					}else if(tecladoint == 3) {//Apresenta a lista de moedas presentes dentro do cofrinho			
								c1.listagemMoedas();
								System.out.println("");
								
					}else if(tecladoint == 4) {//Apresenta o resultado da conversão de todas as moedas presentes dentro do cofrinho, em Real
								c1.totalConversor();	
								
					}else if(tecladoint == 5){//Apresenta uma lista de opções de moeda, para usuário obter informações				
								System.out.println("Escolha uma das opções abaixo para saber informações");
								System.out.println("1.Dolar");
								System.out.println("2.Euro");
								System.out.println("3.Libra");
								System.out.println("4.Real");
								int moeda = teclado.nextInt();
								if(moeda == 1) {
									dolar.info();
								}else if(moeda == 2){
									euro.info();
								}else if(moeda == 3) {
									real.info();																	
								}else if(moeda == 4) {
									libra.info();
								}
								else {
									System.out.println("Digite uma opção válida");
								}
					}
									
					}
				else{//Exibe a mensagem abaixo, caso o usuário digite algum número diferente de 1 a 6
					System.out.println("Opção inválida");
				}
					
				if(tecladoint == 6) {//Encerra o programa, caso o usuário escolha a opção 6
					System.out.println("Ok, encerrando o programa....");
					teclado.close();//Encerra o scanner antes de parar a execução do programa
					break;
				}
			
			
		}catch(InputMismatchException e) {//Um tratamento de exceção para entradas inválidas. Exemplo: símbolos como !, #,& e etc...
			System.out.println("Entrada inválida. Por favor escolha umas das opções do Menu");
			teclado.next();
			
		}catch(Exception  e) {//Um tratamento para qualquer outro erro que ocorra durante a execução do programa
			System.out.println("Ocorreu um erro inesperado" + e.getMessage());
		}
			
			
			}
			
			
				
			}
				
		
			
		
	
	}


