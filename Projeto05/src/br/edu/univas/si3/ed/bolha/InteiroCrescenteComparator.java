package br.edu.univas.si3.ed.bolha;

import java.util.Comparator;

public class InteiroCrescenteComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		
		//também podemos fazer assim:
		//return a.compareTo(b);

		if (a < b) {
			return -1; //está invertido
		} else if (a > b) {
			return 1; //está invertido
		} else {
			return 0;
		}
	}
}
