package br.edu.univas.si3.ed.bolha;

import java.util.Comparator;

public class OrdenacaoBolha {

	public void ordenarBolhaV1(int[] vetor) {
		int n = vetor.length;
		int i, j;
		for (i = n - 1; i >= 1; i--) {
			for (j = 0; j < i; j++) {
				if (vetor[j] > vetor[j + 1]) { // caso estiver fora de ordem
					// faz a troca dos elementos
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
			}
		}
	}

	public void ordenarBolhaV3(int[] vetor, Comparator<Integer> cmp) {
		int n = vetor.length;
		int i, j;
		for (i = n - 1; i >= 1; i--) {
			int troca = 0;
			for (j = 0; j < i; j++)
				if (cmp.compare(vetor[j], vetor[j + 1]) > 0) { // caso estiver fora de ordem
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
					troca = 1;
				}
			if (troca == 0) { // nao houve troca
				return;
			}
		}
	}
}
