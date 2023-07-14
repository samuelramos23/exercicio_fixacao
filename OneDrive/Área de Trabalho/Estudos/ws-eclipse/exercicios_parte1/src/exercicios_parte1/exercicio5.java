package exercicios_parte1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p1 = sc.nextInt();
		int nump1 = sc.nextInt();
		double valorp1 = sc.nextDouble();
		int p2 = sc.nextInt();
		int nump2 = sc.nextInt();
		double valorp2 = sc.nextDouble();
		double valort = (nump1 * valorp1) + (nump2 * valorp2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valort);
		
		sc.close();
		
	}

}
