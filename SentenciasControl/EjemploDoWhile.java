/*Ejemplo Do whiel */

import java.util.Scanner;
public class EjemploDoWhile{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		double n;

		do{
			System.out.println("Numero : ");
			n = entrada.nextInt();
		}
		while( n > 10)
	}
}