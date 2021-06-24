package br.edu.univas.si3.ed.quick;

import java.util.Comparator;

public class Runner01 {

	public static void main(String[] args) {
		Integer vetor[] = new Integer[] { 6, 3, 9, 8, 4, 6, 5, 2 };

		Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);
		QuickSort<Integer> quick = new QuickSort<Integer>();

		System.out.print("Vetor original: ");
		quick.printVetor(vetor);

		quick.quickSort(vetor, 0, vetor.length - 1, comp);

		System.out.print("Vetor ordenado: ");
		quick.printVetor(vetor);
	}
}
