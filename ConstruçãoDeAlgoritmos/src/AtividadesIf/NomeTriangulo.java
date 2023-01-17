package AtividadesIf;
/*
Faça um algoritmo que leia o valor dos lados de um triângulo e diga se é equilátero, 
isósceles ou escaleno.
- Equilátero se: A = B = C.
- Isósceles se: A = B ou B = C ou A = C
- Escaleno se: A ≠ B ≠ C
Observe: A, B e C são lados de um triângulo se: A < (B+C) e B < (C+A) e C < (A+B). 
 */
import java.util.Scanner;
public class NomeTriangulo 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		double ladoA, ladoB, ladoC;
		
		System.out.println("Entre com os Três lados do Triangulo: ");
		ladoA = ler.nextDouble();
		ladoB = ler.nextDouble();
		ladoC = ler.nextDouble();
		
		if(ladoA == ladoB && ladoA == ladoC )
			System.out.println("Equilátero");
		else if (ladoA != ladoB && ladoA != ladoC)
			System.out.println("Escaleno");
		else 
			System.out.println("Isósceles");	

	}

}
