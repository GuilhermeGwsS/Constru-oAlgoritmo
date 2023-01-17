package AtividadesWhile;
/*
 Escreva um algoritmo para ler 10 números. Todos os números lidos com valor inferior a 40
devem ser somados. Imprima o valor da soma efetuada.
 */
import java.util.Scanner;
public class SomaSeMenorQue 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int i=0;
		double numero,soma=0;
		
		while(i<10) 
		{
			System.out.print("Insira um numero");
			numero = ler.nextDouble();
						
			if(numero<40)
				soma += numero;
			
			i++;
				
		}
		System.out.println("O resultado da soma dos numeros inferiores a 40 são: "+soma);
	}

}
