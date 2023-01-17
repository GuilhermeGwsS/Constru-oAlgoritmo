package AtividadeArrayList;

import java.util.Scanner;
public class ArraySimples 
{
	public static void main(String[] args) 
	{
		
		int[] vetor = {1,2,3,4,5,6,7,8,9,10};   // ou int vetor[] ____ //declaração do array
												// declaração e reserva de espaço do array ou definição do que ficara no array
		int i;
		
		System.out.println("");		
		System.out.println("Imprimindo array");
		
		for(i=0; i<vetor.length; i++) 
		{
			System.out.println(vetor[i]+"");
			
		}

	}

}
