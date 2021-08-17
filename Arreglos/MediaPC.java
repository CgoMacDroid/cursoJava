/* Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo
y a continuación realizar la media de los números positivos, 
la media de los negativos y contar el número de ceros*/
import java.util.Scanner;
public class MediaPC
{
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);

		float [] n = new float[5];
		float negativosT = 0 , positivosT = 0,conteoPositivos = 0, conteoNegativos = 0;
		int positivos = 0,conteoCeros = 0, negativos = 0;

		for(int i = 0; i < 5; i++)
		{
			System.out.print((i+1) + ".- Digita un numero--> " ); n[i] = entrada.nextFloat();

			if(n[i] == 0)
			{
				conteoCeros++;
			}
			else if(n[i] > 0)
			{
				conteoPositivos += n[i];
				positivos++;
			}
			else
			{
				conteoNegativos += n[i];
				negativos++;
			}
		}

		if(positivos == 0)
		{
			System.out.println("\n No se puede realizar el promedio de los POSITIVOS");
		}
		else
		{
			positivosT = conteoPositivos / positivos;
			System.out.print("\n Media de los Positivos =  " + positivosT);
		}
		

		if(negativos == 0)
		{
			System.out.println("\n No se puede realizar el promedio de los NEGATIVOS");

		}
		else
		{
			negativosT = conteoNegativos / negativos;
			System.out.print("\n Media de los Negativos =  " + negativosT);
		}
		
		System.out.print("\n Total de ceros =  " + conteoCeros);

	}
}