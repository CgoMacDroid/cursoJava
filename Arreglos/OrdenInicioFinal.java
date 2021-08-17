/* Ejercicio 4 : Generar 10 números aleatorios, guardarlos
en un arreglo , y mostrarlo de la siguiente manera : 

Primero 
Último
Segundo
Penultimo
...etc */
import java.util.Scanner;
public class OrdenInicioFinal
{
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
 
		//Arreglo de tamaño 10
		int [] n = new int[10];

		//Llenado del arreglo con los números aleatorios generados
		for(int i = 0 ; i < n.length; i++)
		{
			n[i] = (int) (Math.random() * 50) + 1;
		}

		//Impresión del arreglo original
		System.out.print("\n \n Su arreglo es :  ");
		System.out.print("\n \n n[] = ");

		for(int i : n)
		{
			System.out.print(i + " ");
		}

		System.out.print("\n \n \n");

		//Impresión del arreglo Ordenado

		System.out.println(" Arreglo Ordenado:");
		System.out.print("\n \n n[] = ");
		for(int i = 0 ; i < n.length / 2; i++)
		{
			System.out.print(n[i] + " "); // Primero, Segundo,Tecero
			System.out.print(n[9-i] + " ");

		}
		System.out.print("\n \n \n");

	}
}