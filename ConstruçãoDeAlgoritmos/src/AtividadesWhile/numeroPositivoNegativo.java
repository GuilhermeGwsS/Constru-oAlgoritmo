package AtividadesWhile;
/*
  Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma dos números
positivos e a soma dos números negativos.
 */
import java.util.Scanner;
public class numeroPositivoNegativo 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int i = 0;
		double numero, positivo=0, negativo=0;
		
		while(i<10) 
		{
			System.out.println("Insira um numero:");
			numero = ler.nextDouble();
			
			if(numero>0)
				positivo += numero;
				else
				negativo += numero;
					
			i+=1;  
		}
		
		System.out.println("Os numeros positivos são: "+positivo);
		System.out.println("Os numeros negativos são: "+negativo);
	}

}
