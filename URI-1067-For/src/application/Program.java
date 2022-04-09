package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Para saber os ímpares de um número, digite aqui: ");

		int X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		sc.close();
	}

}
