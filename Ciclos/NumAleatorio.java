/* Ejercicio No. 5: Realizar un juego para adivinar un número . Para ello
generar un número aleatorio entre 0 - 100, y luego ir pidiendo números, indicando 
"es mayor", o "es menor " segun sea el caso respecto a n. 
El proceso termina cuando el usuario acierta y mostrar el numero de intentos. */

import java.util.Scanner;
public class NumAleatorio
{
	public static void main(String args [])
	{
		Scanner leer = new Scanner(System.in);

		//Número Aletorio con la clase Math 0 -100
		int numeroAleatorio = (int) (Math.random()*100);
		int op,cont = 1;

		System.out.print("Adivina el numero ...  "); op = leer.nextInt();

		//Repetir hasta que op y numeroAleatorio sean iguales
		do 
		{
			if( op > numeroAleatorio)
			{
				System.out.print(op + " es mayor, intenta otra vez..."); op = leer.nextInt(); 
				cont++;
			}
			else if(op < numeroAleatorio)
			{
				System.out.print(op + " es menor, intenta otra vez..."); op = leer.nextInt(); 
				cont++;
			}

		}
		while(op != numeroAleatorio);

		//Si adivina
		System.out.println("Felicidades " + numeroAleatorio + " es el numero");
		System.out.println("Intentos -->" + cont);

	}
}
