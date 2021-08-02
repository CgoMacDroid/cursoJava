/* Pedir dos números y decir cual es el mayor o si son iguales */

import java.util.Scanner;
public class MayorMenorIgual{
	public static void main(String args[]){
		Scanner consola = new Scanner(System.in);

		int a, b;

		System.out.println("Digita dos numeros : ");
		a = consola.nextInt();
		b = consola.nextInt();

		if(a > b)
			System.out.println(a + " es mayor");
		else if (a == b)
			System.out.println( a + " y "+ b + " son iguales");
		else
			System.out.println(b + " es mayor");

	}
}