/* Ejercicio NO. 6 : Pedir números hasta que se teclee un 0,
mostrar la suma de todos los números */
import java.util.Scanner;
public class SumaCero
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);

		int n,con = 0;

		do
		{
			System.out.print("Ingresa un numero -->"); n = leer.nextInt();

			//Contador va a ser igual a 0 mas num , ejemplo = 0 + 1 = 1 ahora en el segundo intento 1 + 2  = 3 ...
			con = con + n;
		}
		while(n != 0);

		System.out.println("Upppps ingresaste un " + n);
		System.out.println("La suma total de los numeros es -->" + con);

	}
}