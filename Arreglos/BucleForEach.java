
/* Bucle For Each, facilita en demasiada la busqueda o el recorrido de los arreglos */
import java.util.Scanner;
public class BucleForEach{
	public static void main(String args[]){

		Scanner entrada = new Scanner(System.in);
		int n;

		System.out.print("Digita el tamanio del arreglo: "); n = entrada.nextInt();

		//Declaración del arreglo de tamaño n
		int [] numeros = new int[n];


		//Declaración de datos
		for(int i = 0; i < n; i++){
			System.out.print((i + 1) + ".- Digita un numero: "); numeros[i] = entrada.nextInt();
		}

		//Imprimimos con el bucle for each

		System.out.println("\nIMPRESION DE DATOS MEDIANTE FOR EACH: ");

		for(int i: numeros)
		{
			System.out.println(i);
		}
	}
}