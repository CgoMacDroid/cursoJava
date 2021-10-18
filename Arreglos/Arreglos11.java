/* Ejercicio No.11:
Leer 5 elementos númericos que se introducirán de forma ordenada creciente, guardarlos en una tabla 
de tamaño 10.
Leer un número N e insertarlo en el lugar adecuado para que la tabla
siga ordenada. */

import java.util.Scanner;
public class Arreglos11{

	public static void main(String args[]){

		Scanner leer = new Scanner(System.in);

		int numerosO[] = new int[10];
		int numeroN,j = 0, sitio_num = 0;
		boolean creciente = true;

		do{
			for(int i = 0 ; i<5;i++)
			{
				System.out.print("Digita un numero -->");
				numerosO[i] = leer.nextInt();
			}

			//Comprobar si el arreglo está ordenado en forma creciente
			for(int i=0;i<4;i++){

				//Creciente
				if(numerosO[i] < numerosO[i+1]){

					creciente = true;
				}

				//Decreciente
				if(numerosO[i] > numerosO[i+1]){

					creciente = false;
					break;
				}

				if(creciente == false){
					System.out.println("Los numeros estan desordenados, vuelve a insertarlos");
				}
			}
		}while(creciente == false);

		System.out.print("Digite un numero a insertar-->");
		numeroN = leer.nextInt();

		//Validar la posición en la que debería ir el número 

		while(numerosO[j]<numeroN && j<5){

			sitio_num++;
			j++;
		}

		for(int i=4;i>=sitio_num;i--){
			numerosO[i+1] = numerosO[i];
		}

		//Insertamos el número 
		numerosO[sitio_num] = numeroN;

		System.out.print("El  nuevo arreglo es : ");
		for(int i = 0 ; i<6;i++){

			System.out.print( numerosO[i] + " ");
		}


	}
}