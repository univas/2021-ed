package br.edu.univas.si3.ed.arvore.model;

public class ArvoreBinariaBusca {

	private NoOfInteger raiz;

	public Integer buscar(Integer buscado) {
		return buscarInterno(buscado, raiz);
	}

	private Integer buscarInterno(Integer buscado, NoOfInteger no) {
		if(no == null) {
			return null; //não encontrou
		}
		if(no.info.equals(buscado)) {
			return no.info; //achamos
		}
		//caminhar para um dos lados
		if(buscado < no.info) { //vamos para a esquerda
			return buscarInterno(buscado, no.esq);
		} else { //valos para a direita
			return buscarInterno(buscado, no.dir);
		}
	}
}
