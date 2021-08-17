/*Leer 5 números, guardarlos en  un arreglo y mostrarlos en el mismo orden
introducido*/
import java.util.Scanner;
public class CincoNum{
	public static void main(String args[]){

		Scanner entrada = new Scanner(System.in);
		
		//Arreglo de tamaño 5 
		int [] numeros = new int[5];

		//Inserción de los 5 datos
		for(int i = 0; i < 5; i++){
			System.out.print((i + 1) + ".- Digita un numero: "); numeros[i] = entrada.nextInt();
		}

		//Imprimimos con el bucle for each

		System.out.println("\nIMPRESION DE DATOS MEDIANTE FOR EACH: ");

		for(int i: numeros)
		{
		
			System.out.print(i + " ");
		}
	}
}