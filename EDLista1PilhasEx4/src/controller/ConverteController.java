package controller;

import fatec.edu.pilha.inteiros.berto.*;

public class ConverteController {

	PilhaInt pilha = new PilhaInt(20);
	int size;

	public String DecToBin(int num) {

		if (num == 1) {

			size = pilha.tamanho();

			for (int i = 0; i <= 9; i++) {

				System.out.print(Integer.toString(pilha.desempilhar()) + "\t");

			}

			return "";

		}

		pilha.empilhar(num % 2);

		return (num % 2) + DecToBin(num / 2);

	}

}
