package br.com.codenation;

// GitHub: MarceloSouza1983		e-mail: map_souza1983@gmail.com		Cel: (12) 98813-6040

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) { // Método para calculo da média
		int soma = 0;

		for (int i = 0; i < elements.length; i++) {
			soma += elements[i];
		}

		int media = soma / elements.length;

		System.out.println("A média é: " + media);
		return media;

	}

	public static int mode(int[] elements) {
		Arrays.sort(elements); // Ordena o array em ordem crecente

		// Verifica o elemento que mais se repete
		int maior = 0; int ocorrenciasMaior = -1; int contagem = 1;
		
		for (int i = 1 ; i <= elements.length ; i++ ) {
			if (i < elements.length && elements[i] == elements[i-contagem])
				contagem++;

			else if (contagem > ocorrenciasMaior) {
				maior = elements[i-1];
				ocorrenciasMaior = contagem;
			}
		}

		System.out.println("\nNúmero: " + maior + " apareceu " + ocorrenciasMaior + " vezes.\n");
		return maior;
	}
	
	public static int median(int[] elements) {
		Arrays.sort(elements); // Ordena o array em ordem crecente
		
		if (verificaParOuImpar(elements) == true) {
			int mediana = (elements[elements.length / 2] + elements[elements.length / 2 - 1]) / 2;
			System.out.println("A mediana é: " + mediana);
			return mediana;
		} else {
			int mediana = elements[elements.length / 2];
			System.out.println("A mediana é: " + mediana);
			return mediana;
		}

	}
	
	private static boolean verificaParOuImpar(int[] elements) { // Verifica se um número é par ou ímpar
		int resto = elements.length % 2;
		if (resto == 0) {
			return true;
		} else {
			return false;
		}
	}
}