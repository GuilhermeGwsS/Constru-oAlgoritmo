package AtividadesDoWhile;
/*
 Elaborar um algoritmo que leia 15 valores inteiros. O algoritmo não poderá aceitar o 
número zero. Mostrar:
a. quantidade de números positivos
b. quantidade de números negativos
c. soma de todos os valores positivos
d. soma de todos os valores negativos
 */
import java.util.Scanner;
public class PositivoNegativoSoma 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		 int i=0,numero=0, somaPos=0, somaNeg=0, pos=0, neg=0;
		 		 		
		 do 
		 {		
			 System.out.println("Insira um numero para calculo. Para encerrar compras digite ( 0 ).");
			 numero = ler.nextInt();	 
			 
			 if(numero!=0) 
			 {
				 if(numero>0) 
				 {
					 pos++;
					 somaPos+=numero;				 
				 }
				 else 
				 {
					 neg++;
					 somaNeg+=numero;
					 
				 }
					 
			 }
			
			 i++;		 
		 }
		 while(i<15);
		 
		 System.out.println("Quantidade de numeros positivo: "+pos);
		 System.out.println("Soma dos numeros positivo: "+somaPos);
		 System.out.println("Quantidade de numeros negativos: "+neg);
		 System.out.println("Soma de numeros negativos: "+somaNeg);
	}

}
