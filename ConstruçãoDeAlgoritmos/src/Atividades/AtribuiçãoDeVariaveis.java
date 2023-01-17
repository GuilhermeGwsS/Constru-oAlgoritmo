/*Escreva um algoritmo que declare duas variáveis inteiras, atribua o valor 30 a primeira e 15 
para a segunda. Imprima o resultado da subtração e da multiplicação desses números. 
 */
package Atividades;

public class AtribuiçãoDeVariaveis 
{	
	public static void main(String[] args) 
	{

		int a = 30;
		int b = 15;
		int sub, mult;
		
		
		sub = a*b;
		mult = a/b;
		
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação: " + mult);
		
	}

}
