package br.edu.univas.si3.ed.arvore.model;

public class ArvoreBinariaV1 {

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

	public void imprimirPreOrdem(No no) {
		if (no != null) {
			System.out.print(no.info + "-");
			imprimirPreOrdem(no.esq);
			imprimirPreOrdem(no.dir);
		}
	}
}
