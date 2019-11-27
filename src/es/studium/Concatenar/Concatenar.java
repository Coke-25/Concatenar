package es.studium.Concatenar;

import java.util.Scanner;

public class Concatenar 
{

	public static void main(String[] args) 
	{
		char a, b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una letra:");
		a = teclado.next().charAt(0);
		System.out.println("Dame otra letra:");
		b = teclado.next().charAt(0);
		System.out.println(a +""+ b);
		teclado.close();
	}

}
