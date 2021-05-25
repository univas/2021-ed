package br.edu.univas.si3.ed.arvore.model;

public class ArvoreBinariaV1 {

	private No raiz;
	
	public void criarRaiz(Character caracter, No esq, No dir) {
		raiz = criarSubArvore(caracter, esq, dir);
	}
	
	public No criarNo(Character caracter) {
		No no = new No();
		no.info = caracter;
		return no;
	}

	public No criarSubArvore(Character caracterRaiz, No esquerda, No direita) {
		No pai = criarNo(caracterRaiz);
		pai.esq = esquerda;
		pai.dir = direita;
		return pai;
	}
	
	public void imprimirPreOrdem() {
		imprimirPreOrdemInterno(raiz);
	}

	private void imprimirPreOrdemInterno(No no) { //processa antes de ir para a esquerda (recursivo)
		if (no != null) {
			System.out.print(no.info + "-"); //processa a raiz (da sub-árvore)
			imprimirPreOrdemInterno(no.esq);
			imprimirPreOrdemInterno(no.dir);
		}
	}
	
	public void imprimirEmOrdem() {
		imprimirEmOrdemInterno(raiz);
	}
	
	private void imprimirEmOrdemInterno(No no) { //processa depois que volta da esquerda
		if (no != null) {
			imprimirEmOrdemInterno(no.esq);
			System.out.print(no.info + "-"); //processa a raiz (da sub-árvore)
			imprimirEmOrdemInterno(no.dir);
		}
	}
	
	public void imprimirPosOrdem() {
		imprimirPosrdemInterno(raiz);
	}
	
	private void imprimirPosrdemInterno(No no) { //processa depois que volta da direita
		if (no != null) {
			//System.out.println("Processando nó: " + no.info);
			imprimirPosrdemInterno(no.esq);
			imprimirPosrdemInterno(no.dir);
			System.out.print(no.info + "-"); //processa a raiz (da sub-árvore)
		}
	}
}
