package exercicios_parte1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int z = x + y;
		
		System.out.println("SOMA = "+ z);
		
		sc.close();
	}

}
