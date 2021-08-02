import java.util.Scanner;
public class ecuacionSegundoGrado{
	public static void main(String args[]){

		Scanner entrada = new Scanner(System.in);

		double a,b,c,x1,x2;

		System.out.println("Ingresa los valores de a,b,c en orden");
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();

		x1 = -b + Math.sqrt(Math.pow(b,2) - (4* a * c)) / 2 * a;
		x2 = -b - Math.sqrt(Math.pow(b,2) - (4* a * c)) / 2 * a;

		System.out.println("x1 = " + x1 + "\nx2 = " + x2);


	}
}