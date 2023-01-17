package AtividadeArrayList;
/*
 )Faça um algoritmo que alimente um array com 10 preços (double). 
Posteriormente atualize este array com um aumento de 10% para todos os 
preços. Imprima o array atualizado
 */
import java.util.Scanner;
public class PreçoAjuste10porcento 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int i;
		double [] precos = new double [10];
		double [] ajuste = new double [10];
		double [] valorFinal = new double [10];
		double valor;
		
		for(i=0;i<precos.length;i++) 
		{
			System.out.print("Insira 10 preços: ");	
			valor = ler.nextDouble();
			
			precos[i]+=valor;		
		}
		for(i=0;i<ajuste.length;i++) 
		{
			ajuste[i]=precos[i]*0.10;	
			valorFinal[i] = ajuste[i] +precos[i];
		}
			System.out.println();
			for(i=0;i<valorFinal.length;i++)
		{
				System.out.println(valorFinal[i]+" ");
		}
	}

}
