package Atividades;
/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem 
do distribuidor e dos impostos, ambos aplicados ao custo de fábrica. Supondo que a 
porcentagem do distribuidor seja de 12% e a dos impostos de 45%, prepare um algoritmo para 
ler o custo de fábrica do carro e imprimir o custo ao consumidor
*/
import java.util.Scanner;
public class PorcentagemCusto 
{
	public static void main(String[] args) 
	{
		try (Scanner ler = new Scanner(System.in)) {
			double carroNovo, custoFabrica;
			double porcentagemDist = 0.12;
			double impostos = 0.45;
			System.out.println("Insira o valor do carro em custo de fabrica:");
			custoFabrica = ler.nextDouble();
			
			carroNovo = (custoFabrica*porcentagemDist) + (custoFabrica*impostos);
			
			System.out.println("O Preço desse carro sai no valor de: " + carroNovo + " para o consumidor");
		}
		
		
		
		
		

	}

}
