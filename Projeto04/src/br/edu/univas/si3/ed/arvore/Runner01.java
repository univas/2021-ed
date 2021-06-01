package br.edu.univas.si3.ed.arvore;

import br.edu.univas.si3.ed.arvore.model.ArvoreBinariaV1;
import br.edu.univas.si3.ed.arvore.model.NoOfChar;

public class Runner01 {
	
	public static void main(String[] args) {
			
		ArvoreBinariaV1 arvore = new ArvoreBinariaV1();

		NoOfChar noD = arvore.criarNo('d');
		NoOfChar noE = arvore.criarNo('e');
		NoOfChar noF = arvore.criarNo('f');

		NoOfChar noB = arvore.criarSubArvore('b', null, noD);
		NoOfChar noC = arvore.criarSubArvore('c', noE, noF);
		arvore.criarRaiz('a', noB, noC);

		System.out.println("Processamento pré-ordem: ");
		arvore.imprimirPreOrdem();

		System.out.println("\nProcessamento em-ordem: ");
		arvore.imprimirEmOrdem();

		System.out.println("\nProcessamento pós-ordem: ");
		arvore.imprimirPosOrdem();
	}
}
