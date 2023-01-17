package AtividadeArrayList;
/*
 Faça um algoritmo que receba 8 numeros em um array. Imprima o array em 
ordem inversa. 
 */
import java.util.Scanner;
public class ArrayOrdemInversa 
{
	public static void main(String[] args) 
	{
		int i, numero;
		int vetor[] = new int[8];

		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<vetor.length;i++) 
		{
			System.out.println("Digite os valores do array");
			numero = ler.nextInt();	
			
			vetor[i]+=numero;
		}
		for(i=vetor.length-1;i>=0;i--) // Incrementação para imprimir ao contrario
		{
			System.out.println(vetor[i] +" ");
			
		}
	}
}
