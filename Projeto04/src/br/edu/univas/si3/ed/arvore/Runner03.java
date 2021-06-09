package br.edu.univas.si3.ed.arvore;

import br.edu.univas.si3.ed.arvore.model.ArvoreBinariaBusca;

public class Runner03 {

	static ArvoreBinariaBusca arv = new ArvoreBinariaBusca();

	public static void main(String[] args) {
		Integer encontrado = arv.buscar(1);// não acha pois árvore está vazia
		System.out.println("Encontrado: " + encontrado);

		testInsert(12);
		testInsert(2);
		testInsert(18);
		
		int [] vetor = new int [] { 5,19,15,9,10,3,4,7,11,13,14,16,17,20,1,6,8 };
		
		for (int valor : vetor) {
			testInsert(valor);
		}
		
		arv.imprimirEmOrdem();
	}

	private static void testInsert(int valor) {
		arv.inserir(valor);
		Integer encontrado = arv.buscar(valor);
		System.out.println("Encontrado: " + encontrado);
	}
}
