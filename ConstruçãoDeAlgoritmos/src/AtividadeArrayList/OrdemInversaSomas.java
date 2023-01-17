package AtividadeArrayList;
/*Faça um algoritmo que receba 8 nomes em um array, posteriormente crie um 
segundo array que receba os nomes do primeiro array em ordem inversa. 
Imprima o array resultante.
*/
import java.util.Scanner;
public class OrdemInversaSomas 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int i;
		String nome1[] = new String[8];
		String nome2[] = new String[8];
		String nome;
	
		for(i=0;i<nome1.length;i++) 
		{
			System.out.println("Digite os nomes do array");
			nome = ler.nextLine();	
			
			nome1[i] += nome;
			nome2[i]+=nome1[i];
		}
		for(i=nome2.length-1;i>=0;i--)
		{
			System.out.println(nome2[i]+" ");
		}
	}

}
