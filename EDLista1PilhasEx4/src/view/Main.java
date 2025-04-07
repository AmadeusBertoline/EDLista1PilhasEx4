package view;

import controller.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ConverteController converte = new ConverteController();
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		int opc = 0, num;

		while (i == 0) {

			System.out.println("Digite um valor até 1000 para converter em binário");
			num = scanner.nextInt();

			if (num == 0) {

				System.out.println("0");

			} else if (num >= 0 && num <= 1000) {

				converte.DecToBin(num);
				i = 9;

			} else {

				System.out.println("Valor incorreto");

			}

		}

		System.out.println("Fim");

		scanner.close();

	}

}
