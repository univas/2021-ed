package br.edu.univas.si3.ed.bolha;

import java.util.Comparator;

public class Runner04 {

	public static void main(String[] args) {
		OrdenacaoBolha<String> bolha = new OrdenacaoBolha<>();
		//StringComparator strComp = new StringComparator();
		
//		Comparator<String> strComp = new Comparator<> () { //inner class
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.compareTo(s2);
//			}
//		};
		
		Comparator<String> strComp = (s1, s2) -> s1.compareTo(s2); //usando lambda (versão simples). Existem outras versão.
		//o lambda só funciona com FunctionalInterface

		String vetor[] = new String[] { "25", "48", "37", "12", "57", "86", "33", "92", "a", "$", "+" };
		
		bolha.ordenarBolhaV5(vetor, strComp);
		System.out.println("String ordenadas: ");
		for (String str : vetor) {
			System.out.println(str);
		}
	}

}
