package br.edu.univas.si3.ed.arvore;

import br.edu.univas.si3.ed.arvore.model.ArvoreBinariaV1;
import br.edu.univas.si3.ed.arvore.model.No;

public class Runner02 {
	public static void main(String[] args) {
		ArvoreBinariaV1 arvore = new ArvoreBinariaV1();

		No noD = arvore.criarNo('d');
		No noE = arvore.criarNo('e');
		No noG = arvore.criarNo('g'); // novo nó 'g' que será filho do nó 'f'
		No noF = arvore.criarSubArvore('f', null, noG);

		No noB = arvore.criarSubArvore('b', null, noD);
		No noC = arvore.criarSubArvore('c', noE, noF);
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
