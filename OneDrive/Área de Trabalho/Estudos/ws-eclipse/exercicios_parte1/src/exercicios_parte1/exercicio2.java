package exercicios_parte1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double raio2 = Math.pow(raio, 2);
		double area = pi*raio2;
		
		System.out.printf("A= %.4f", area);
		
		sc.close();

	}

}
