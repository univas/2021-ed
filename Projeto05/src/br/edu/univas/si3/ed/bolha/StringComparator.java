package br.edu.univas.si3.ed.bolha;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
