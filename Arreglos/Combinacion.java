/* Ejericio 6 : Leer los datos correspondientes a dos tablas 
de 12 números , mezclarlos en una tercera la siguiente forma:
3 de la tabla A, 3 de la tabla b, y así sucesivamente */

import java.util.Scanner;
public class Combinacion{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		//Definimos los 3 arreglos
		int [] n1 = new int[12];
		int [] n2 = new int[12];
		int [] n3 = new int[24];
		

		//Generamos los 2 arreglos aleatoriamente

		for(int i = 0; i < n1.length; i++){
			n1[i] = (int) (Math.random() * 50) + 1;
		}

		for(int i = 0; i < n2.length; i++){
			n2[i] = (int) (Math.random() * 50) + 1;
		}

		//Mostramos los arreglos

		System.out.print("\n \n n1[] = ");
		for(int i:n1){
			System.out.print(i + " ");
		}

		System.out.print("\n \n n2[] = ");
		for(int i:n2){
			System.out.print(i + " ");
		}

		//Mezclar los arreglos 
		int i = 0 , j = 0; // i controlará el arreglo n1 y n2 j el arreglo n3

		while(i < 12) 
		{

			//Imprimir los primeros primeros 3 de a
			for(int k = 0 ; k < 3 ; k++)
			{
				n3[j] = n1[i + k];
				j++;
			}

			//Imprimimos los 3 primeros de b
			for(int k = 0 ; k < 3; k++){
				n3[j] = n2[i + k];
				j++;
			}

			i+=3; //Aumentamos 
		}

		//Imprimir el 3er arreglo
		System.out.print("\n \n n3[] = ");
		for(int k:n3){
			System.out.print(k + " ");
		}


	}
}