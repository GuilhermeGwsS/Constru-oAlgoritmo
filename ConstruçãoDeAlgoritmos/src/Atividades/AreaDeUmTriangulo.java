package Atividades;
/*. Escreva um algoritmo que receba dois números inseridos por um usuário. O primeiro número 
será a altura do triângulo, o segundo número será a base do triângulo. Posteriormente calcule 
a área deste triângulo. Sabe-se que: A = (base* altura)/2. Imprima a área do mesmo.
Crie as variáveis do tipo double.*
 */

import java.util.Scanner;
public class AreaDeUmTriangulo 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		double altura, base, area;
		
		System.out.println("Insira a Altura do Triangulo:");
		altura = ler.nextDouble();
		System.out.println("Insira a Base do Triangulo:");
		base = ler.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("A area do triangulo é: " + area);

	}

}
