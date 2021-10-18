/* 
Ejercicio 10 : 
Crear un programa que lea por teclado
una tabla de 10 números y desplace N posiciones en el
arreglo (N es digitado por el usuario) */

import java.util.Scanner;
public class Arreglos10
{
	public static void main(String args[])
	{

		Scanner leer = new Scanner(System.in);

		int tabla[] = new int[10];
		int posicion,ultimo;

		for(int i=0;i<10;i++)
		{
			System.out.print(i + ".- Digita un dato-->");
			tabla[i] = leer.nextInt();
		}

		System.out.print("\n Ingresa la posicion--> ");
		posicion = leer.nextInt();

		//Algoritmo para desplazamiento de 1 en 1 posiciones hasta la posicion ingresada
		for(int vuelta = 1;vuelta<=posicion;vuelta++){

			//Guardamos el último dato siempre
			ultimo = tabla[9] ;

			//Avanzamos una posición 
			for (int i = 8; i>=0;i--){
				tabla[i+1] = tabla[i];
			}

			//Asignamos de nuevo el ultimo dato

			tabla[0] = ultimo;

		}

		//Imprimimos el nuevo arreglo
		System.out.print("\n El nuevo arreglo es :");
		for(int i:tabla)
		{
			System.out.print(i + " ");
		}
	}
}
