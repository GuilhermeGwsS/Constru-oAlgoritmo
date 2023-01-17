package AtividadeArrayList;
/*
 Faça um algoritmo que receba 8 nomes em um array. Imprima o array em 
ordem inversa. 
 */
import java.util.Scanner;
public class NomeOrdemInversa 
{
	public static void main(String[] args) 
	{
		String vetor[] = new String[8];
		String nome;
		int i;
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<vetor.length;i++) 
		{
			System.out.println("Digite os nomes do array");
			nome = ler.nextLine();	
			
			vetor[i] += nome;
		}
		for(i=vetor.length-1;i>=0;i--) // Incrementação para imprimir ao contrario
		{
			System.out.println(vetor[i] +" ");
			
		}
	}
}
