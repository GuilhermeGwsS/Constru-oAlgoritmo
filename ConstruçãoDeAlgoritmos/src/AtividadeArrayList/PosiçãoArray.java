package AtividadeArrayList;
/*
 Escreva um algoritmo que leia um array de 5 elementos inteiros. Encontre e mostre o menor 
elemento e sua posição no array
 */
import java.util.Random;
public class PosiçãoArray 
{
	public static void main(String[] args) 
	{
		Random ler = new Random(); // Random no lugar de Scanner
		
		int i, auxMenor, posicao;
		int[] x = new int [5];
		 for(i=0;i<x.length;i++) 
		 {
			 x[i] = ler.nextInt(100); // gerando numeros automaticos		 
		 }
		 
		 auxMenor=x[0];
		 posicao=0;
		 
		 for(i=0;i<x.length;i++) 
		 {
			 if(x[i] < auxMenor) 
			 {
				 auxMenor = x[i];
				 posicao=1;
			 }	 
		 }
		 
		 System.out.println();
		 System.out.println();
		for(i=0;i<x.length;i++) 
		{
			System.out.println(x[i]+" ");
		}
		 
		System.out.println();
		System.out.println();
		System.out.println("O menor numero do vetor é: "+auxMenor);
		System.out.println("O maior numero do vetor é: "+ posicao);
		 
		 
	}

}
