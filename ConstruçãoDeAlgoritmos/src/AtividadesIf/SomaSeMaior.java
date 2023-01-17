package AtividadesIf;
/*
 Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição. Se for 
maior que 10, apresentá-lo.
 */
import java.util.Scanner;
public class SomaSeMaior 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, resultado;
		
		System.out.println("Insira Dois numeros abaixo:");
		numero1 = ler.nextInt();
		numero2 = ler.nextInt();
		
		resultado = numero1 + numero2;
				
		if(numero1+numero2>10)
			System.out.println(resultado);
	}

}
