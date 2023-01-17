package AtividadesDoWhile;
/*
 Faça um programa que leia a descrição do produto, o preço unitário e a quantidade. 
Imprima o valor total da compra. O cliente pode escolher mais de um produto e a leitura se 
encerra quando for digitado FIM na descrição do produto.
 */
import java.util.Scanner;
public class DescriçãoValorQuantTotalFim 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		 double precoUni=0, quant=0, valorTotal=0, valorCompra=0;
		 String nome, descricao = null;
		 
		 do 
		 {
			 ler = new Scanner(System.in);
			 
			 System.out.println("Insira a Descrição do Produto. Para encerrar compras digite FIM.");
			 nome = ler.nextLine();

			 if(!"FIM".equals(nome)) 
			 {
				 System.out.println("Insira a o preço unitario e a quantidade do produto:");
				 precoUni = ler.nextDouble();
				 quant = ler.nextDouble();
				 
				 valorCompra = precoUni * quant;	
				 
				 System.out.println("Descrição do Produto: "+nome);
				 System.out.println("Preço Unitario do Produto: "+precoUni);
				 System.out.println("Quantidade: "+quant);
				 System.out.println("Valor total: "+valorCompra);
				 
				 valorTotal+=valorCompra;
				 descricao += nome;
			 }	 
		 }
		 while(!"FIM".equals(nome)); 
		 System.out.println("Descrição total da compra: "+descricao);
		 System.out.println("Valor total da compra: "+valorTotal);		
		 
	}

}
