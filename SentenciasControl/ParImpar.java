import java.util.Scanner;
public class ParImpar{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int a,b;

		System.out.println("Ingrese dos numeros : "); a = entrada.nextInt(); b = entrada.nextInt();

		if((a % 2 == 0) && (b % 2 ==0))
		{
			System.out.println(a  + " y " + b + " son pares");
		}
		else if((a % 2 == 0) && (b % 2 != 0))
		{
			System.out.println(a  + " es par y  " + b + " es impar");
		}
		else if((a % 2 != 0) && (b % 2 == 0)){
			System.out.println(a  + " es impar y  " + b + " es par");
		}
		else
		{
			System.out.println(a + " y " + b + " son impares");
		}
	}

}