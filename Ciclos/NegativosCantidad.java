import java.util.Scanner;
public class NegativosCantidad
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);

		int num, cont= 0 ;
		
		do
		{
			System.out.println("Digita un numero... "); num = leer.nextInt();
			cont++;

		} while(num >= 0);

		System.out.println(num + " es negativo");
		System.out.println("Numeros introducidos : " + cont);
	}	
}