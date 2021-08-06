/* Ejercicio FIZZ BUZZ : REGLAS
SI EL NUMERO ES MULTIPLO DE 3 IMPRIMIR FIZZ
SI EL NUMERO ES MULTIPLO DE 5 IMPRIMIR BUZZ
SI EL NUMERO ES MULTIPLO DE AMBOS IMPRIMIR FIZZ BUZZ*/
import java.util.Scanner;
public class FizzBuzz
{
	public static void main(String args[])
	{

		Scanner leer = new Scanner(System.in);

		//Muestra los numeros del 1 al 100
		for(int i = 1; i <= 100 ; i++)
		{
   			 if(i % 3 == 0  && i % 5 == 0)//CONDICIÓN MENOS IMPORTANTE 
    		{
        		System.out.println( i + " FIZZ BUZZ");
   			}
    		else if(i % 3 == 0)
    		{
        		System.out.println( i + " FIZZ ");
    		}
    		else if(i % 5 == 0)
   			{
        		System.out.println( i + " BUZZ ");
    		}
		}
	}
}