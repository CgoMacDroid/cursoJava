/* Ejercicio 5 : Lerr 5 números , guardarlos en un arreglo 
 y mostrarlos en el orden inverso al introducido */
 import java.util.Scanner;
 public class Invertidos{
 	public static void main(String args[]){
 		Scanner entrada = new Scanner(System.in);

 		//Tamaño de Arreglo
 		int tam;
 		System.out.print("Digita el tamanio del arreglo -->"); tam = entrada.nextInt();

 		//Declaración del arreglo de tamaño tam
		int [] n = new int[tam];

 		//Solicitud de datos
 		for(int i = 0 ; i < tam ; i++){
 			System.out.print( (i + 1) + " .-Digita un numero --> "); n[i] = entrada.nextInt();
 		}

 		System.out.println("\n ****Orden inverso****: ");

 		//Impresión de datos
 		for(int i = n.length-1 ; i >= 0 ; i--)
 		{

 			if(i == 0)
 				System.out.print(n[i]);
 			else
 				System.out.print(n[i] + " , ");

 		}

 	}
 }