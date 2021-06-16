package br.edu.univas.si3.ed.bolha;

import java.util.Comparator;

public class InteiroDecrescenteComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		if (a < b) {
			return 1;
		} else if (a > b) {
			return -1;
		} else {
			return 0;
		}
	}
}
