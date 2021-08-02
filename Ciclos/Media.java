/* Ejercicio No.7 : Pedir números hasta que se introduzca uno negativo 
 y calcular la media */
 import java.util.Scanner;

 public class Media
 {
 	public static void main(String args[])
 	{
 		Scanner leer = new Scanner(System.in);

 		int n,i = 0,media = 0 ; 
 		float mediaT = 0 ;

 		System.out.print("Digita un numero..."); n = leer.nextInt();

 		while(n >= 0 )
 		{
 			media += n ;
 			i++;
 			System.out.print("\nDigita otro numero..."); n = leer.nextInt();

 		}

 		if(i == 0)
 			System.out.println("ERROR , imposible dividir entre 0" );
 		else
 			mediaT = (float) media / i;
 			System.out.println("\nLa media es ... " + mediaT); 
 	}
 }