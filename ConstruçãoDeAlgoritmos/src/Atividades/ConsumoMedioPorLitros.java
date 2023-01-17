package Atividades;
/*Escreva um algoritmo para calcular o consumo médio de um automóvel (medido em Km/l), 
dado que são conhecidos a distância total percorrida e o volume de combustível consumido 
para percorrê-la (medido em litros). CM = DIST / VOL.* 
 */

import java.util.Scanner;
public class ConsumoMedioPorLitros 
{
	public static void main(String[] args) 
	{

		Scanner	ler = new Scanner(System.in);
		
		double distancia, volume, cm;
		
		System.out.println("Insira a distancia percorrida pelo automovel em km:");
		distancia = ler.nextDouble();
		System.out.println("Insira o volume de combustivel consumido em litros:");
		volume = ler.nextDouble();
		
		cm = distancia/volume;
		
		System.out.println("O Consumo Medio desse automovel foi de: " + cm + "Km/L");
		
		
		

	}

}
