package br.edu.univas.si3.ed.arvore;

import br.edu.univas.si3.ed.arvore.model.ArvoreBinariaV1;
import br.edu.univas.si3.ed.arvore.model.NoOfChar;

public class Runner02 {
	public static void main(String[] args) {
		ArvoreBinariaV1 arvore = new ArvoreBinariaV1();

		NoOfChar noD = arvore.criarNo('d');
		NoOfChar noE = arvore.criarNo('e');
		NoOfChar noG = arvore.criarNo('g'); // novo nó 'g' que será filho do nó 'f'
		NoOfChar noF = arvore.criarSubArvore('f', null, noG);

		NoOfChar noB = arvore.criarSubArvore('b', null, noD);
		NoOfChar noC = arvore.criarSubArvore('c', noE, noF);
		arvore.criarRaiz('a', noB, noC);

		int quantidadeNos = arvore.quantidadeNos();
		System.out.println("Quantidade de nós da árvore: " + quantidadeNos);

		int altura = arvore.altura();
		System.out.println("Altura da árvore: " + altura);

		System.out.println(arvore.buscarElemento('a'));
		System.out.println(arvore.buscarElemento('d'));
		System.out.println(arvore.buscarElemento('g'));
		System.out.println(arvore.buscarElemento('h')); //não existe
	}
}
