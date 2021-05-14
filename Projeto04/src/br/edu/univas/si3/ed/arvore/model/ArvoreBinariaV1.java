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

	private void imprimirPreOrdemInterno(No no) {
		if (no != null) {
			System.out.print(no.info + "-");
			imprimirPreOrdemInterno(no.esq);
			imprimirPreOrdemInterno(no.dir);
		}
	}
}
