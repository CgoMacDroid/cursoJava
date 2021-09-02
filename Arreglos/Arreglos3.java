/* Mezclar 2 arreglos en uno solo */
import java.util.Scanner;
public class Arreglos3
{
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);

		//Definimos 2 arreglos de tamaño n
		int [] n1 = new int[10];
		int [] n2 = new int[10];
		int [] n3 = new int[20];
		int j = 0 ;

		//Números aleatorios del 1 - 50 PRIMER ARREGLO
		for(int i = 0 ; i < n1.length; i++)
		{
			n1[i] = (int) (Math.random() * 50) + 1;
		}

		//Segundo Arreglo 
		for(int i = 0 ; i < n2.length; i++)
		{
			n2[i] = (int) (Math.random() * 50) + 1;
		}

		//Impresión de los arreglos con los números Aleatorios
		System.out.print("\n \n \t \t**** SUS ARREGLOS SON: ****");
		System.out.print("\n \n n1[] = ");
		for(int i:n1){
			System.out.print( i + " ");
		}

		System.out.print("\n \n n2[] = ");

		for(int i:n2)
		{
			System.out.print( i + " ");
		}

		//Combinación de ambos arreglos
		for(int i = 0 ; i < 10; i++)
		{
			n3[j] = n1[i];
			j++;//Siguiente posición

			n3[j] = n2[i];
			j++;
		}

		//Impresión del TERCER ARREGLO Combinado
		System.out.print("\n \n \t \t**** ARREGLO COMBINADO ****");
		System.out.print("\n \n n3[] = ");
		for(int i:n3)
		{
			System.out.print(i + " ");
		}

		System.out.print("\n \n");


	}

}