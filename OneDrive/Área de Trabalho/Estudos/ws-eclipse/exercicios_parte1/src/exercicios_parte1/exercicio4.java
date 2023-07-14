package exercicios_parte1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int salary = sc.nextInt();
		double hour = sc.nextDouble();
		double pay = salary*hour;
		
		System.out.println("Number = " + number);
		System.out.printf("Salary U$= %.2f", pay);
		
		sc.close();

	}

}
