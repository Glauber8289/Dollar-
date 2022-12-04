package util;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
	     
		  Locale.setDefault(Locale.US);
	      Scanner sc = new Scanner(System.in);
	      double d = conversao.dollar;
	      System.out.printf("Olá seja bem vindo ao conversor,o valor do dolar atualmente é %.2f%n",d);
	      System.out.print("Digite o valor para ser convertido em dollar? ");
	      double valor = sc.nextDouble();
	      
	      double v = conversao.valorc(valor);
	      double vt = conversao.taxa(valor);
	      System.out.println("O valor em R$ convertido para USD sem a taxa de 6% é " + v);
	      System.out.println("O valor em R$ convertido para USD com uma taxa de 6% sobre o valor convertido é " + vt);
	      
	  sc.close();

	}

}
