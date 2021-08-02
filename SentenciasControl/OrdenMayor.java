import java.util.Scanner;
public class OrdenMayor{
	public static void main(String args[])
	{
		Scanner entrada = new Scanner (System.in);

		int a,b,c;
		System.out.println("Ingresa 3 numeros -->");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();

		if((a > b) && (b > c))
		{
			System.out.println("Orden" + a + "-" + b + "-" + c);
		}
		
		else if((a > c ) && (c > b)){
			System.out.println("Orden" + a + "-" + c + "-" + b);
		}

		else if((b > a ) && (a > c)){
			System.out.println("Orden" + b + "-" + a + "-" + c);
		}

		else if((b > a ) && (c > a)){
			System.out.println("Orden" + b + "-" + c + "-" + a);
		}

		else if((c > a ) && (a > b)){
			System.out.println("Orden" + c + "-" + a + "-" + b);
		}

		else if((c > b ) && (b > a)){
			System.out.println("Orden" + c + "-" + b + "-" + a);
		}
	}
}