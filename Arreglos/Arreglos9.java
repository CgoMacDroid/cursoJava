/* EJERCICIO 9 : 

Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace
una posición hacia abajo : 

El primero pasa a ser el segundo, el tercero pasa a a ser el tercer y así sucesivamentre.
El último pasa a ser el primero . */

import java.util.Scanner;
public class Arreglos9
{
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);

		//Tabla de 10 números enteros
		int tabla [] = new int[10];

		int ultimoDato;

		//Solicitamos los 10 datos
		for(int i = 0; i<10;i++)
		{

			System.out.print(i + ".- Ingresa un numero -->"); 
			tabla[i] = leer.nextInt();
		}

		//Guardamos el último elemento pues al avanzar este se perderá
		ultimoDato = tabla[9];

		//Movemos los datos una posición
		for(int i = 8; i>=0; i--)
		{
			tabla[i + 1] = tabla[i];
		}

		//Asignamos el último valor que guardamos

		tabla[0] = ultimoDato;

		//Imprimimos el nuevo arreglo
		System.out.println("El nuevo arreglo es -->");
		System.out.println("\n");
		for(int i:tabla)
		{

			System.out.print(i + " ");
		}
	}
}