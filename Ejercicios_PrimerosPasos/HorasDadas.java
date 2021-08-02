/* Ejercicio 6 Calular semanas, días apartir de horas dadas.*/
import java.util.Scanner;
public class HorasDadas{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		int hr, semanasT,diasT,horasT;

		System.out.println("Digita el total de horas a Calular");
		hr = entrada.nextInt();

		//1 semana = 168 horas	

		semanasT = hr / 168 ;

		diasT = (hr % 168) / 24;

		horasT = hr % 24;

		System.out.println("Semanas = " + semanasT + "\nDias = " + diasT + "\nHoras = " + horasT);

	}
}