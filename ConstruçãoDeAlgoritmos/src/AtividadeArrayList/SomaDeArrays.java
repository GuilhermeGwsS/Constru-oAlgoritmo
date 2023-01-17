package AtividadeArrayList;
/*
 )Carregue dois arrays com 10 números inteiros cada. Gere um terceiro array
somando os elementos do primeiro array com o segundo vetor. Imprima o array
resultante.
VETNUM1
10 20 13 4 5 40 55 2 35 8
 0 1 2 3 4 5 6 7 8 9
VETNUM2
4 14 23 1 55 43 14 18 16 3
0 1 2 3 4 5 6 7 8 9
VETSOMA
14 34 36 5 60 83 69 20 51 11
0 1 2 3 4 5 6 7 8 9
 */
import java.util.Scanner;
public class SomaDeArrays 
{
	public static void main(String[] args) 
	{
				
		int[] vetNum1 = new int[10];
		int[] vetNum2 = new int[10];
		int[] vetSoma = new int[10];
		int i;

		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<vetNum1.length;i++) 
		{
			System.out.print("Digite os valores do primeiro array ");	
			vetNum1[i] = ler.nextInt();
			
		}
		for(i=0;i<vetNum2.length;i++) 
		{
			System.out.print("Digite os valores do segundo array ");
			vetNum2[i] = ler.nextInt();
		}
		for(i=0;i<vetSoma.length;i++) //processamento
		{
			vetSoma[i] = vetNum1[i] + vetNum2[i];
		}
		System.out.println();
			for(i=0;i<vetSoma.length;i++) //saida
			{
				System.out.print(vetSoma[i] + " ");
			}
	}

}
