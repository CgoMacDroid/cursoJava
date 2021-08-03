/* Este programa ejemplifica el llenado de un arreglo , de acuerdo 
al tamaño que digite el usuario. 
Mostrará los elementos del arreglo . */

import java.util.Scanner;
public class Arreglos2
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);

		//Definifimos la variable que recibirá el tamaño de arreglo
		int n;

		//Solicitamos el tamaño de arreglo 
		System.out.print("Digita el tamanio del arreglo... "); n = leer.nextInt();

		//Definimos nuestro arreglo del tamaño que inidique el usuario 
		char[] letras = new char[n];


		//Ciclo utilizado para leer y guardar los datos en el arreglo letras
		for(int i = 0; i < n; i++)
		{
			System.out.print((i+1) + ".-Digite un caracter: "); //el i + 1 es para mostrar un listado comenzando con el 1.-
			letras[i] = leer.next().charAt(0);
		}


		//Imprimimos los valores del arreglo 
		System.out.println("Los valores del arreglo son : ");

		for(int i = 0; i < n; i++)
		{
			System.out.println( (i + 1) + ".- "+ letras[i] );
		}

	}
}
