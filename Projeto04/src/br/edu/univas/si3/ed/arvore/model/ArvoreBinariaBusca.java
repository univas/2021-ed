package br.edu.univas.si3.ed.arvore.model;

public class ArvoreBinariaBusca {

	private NoOfInteger raiz;

	public void inserir(Integer novoValor) { // TODO: melhorar o valor de retorno para indicar sucesso na inserção
		if (raiz == null) { //a árvore está vazia
			raiz = criarNo(novoValor);
		} else {
			inserirInterno(novoValor, raiz);
		}
	}

	private void inserirInterno(Integer novoValor, NoOfInteger no) {
		
		//tratar valor igual - se o valo já existe, não precisa inserir novamente
		if(novoValor == no.info) {
			return;
		}

		if (novoValor < no.info) { // vai para a esquerda
			if (no.esq == null) {
				no.esq = criarNo(novoValor);// insere o novo nó na esquerda
			} else {
				inserirInterno(novoValor, no.esq);
			}
		} else { // vai para a direita
			if (no.dir == null) {
				no.dir = criarNo(novoValor);// insere o novo nó na direita
			} else {
				inserirInterno(novoValor, no.dir);
			}
		}
	}

	private NoOfInteger criarNo(Integer valor) {
		NoOfInteger no = new NoOfInteger();
		no.info = valor;
		return no;
	}

	public Integer buscar(Integer buscado) {
		return buscarInterno(buscado, raiz);
	}

	private Integer buscarInterno(Integer buscado, NoOfInteger no) {
		if (no == null) {
			return null; // não encontrou
		}
		if (no.info.equals(buscado)) {
			return no.info; // achamos
		}
		// caminhar para um dos lados
		if (buscado < no.info) { // vamos para a esquerda
			return buscarInterno(buscado, no.esq);
		} else { // valos para a direita
			return buscarInterno(buscado, no.dir);
		}
	}
	
	public void imprimirEmOrdem() {
		imprimirEmOrdemInterno(raiz);
	}
	
	private void imprimirEmOrdemInterno(NoOfInteger no) { //processa depois que volta da esquerda
		if (no != null) {
			imprimirEmOrdemInterno(no.esq);
			System.out.print(no.info + "-"); //processa a raiz (da sub-árvore)
			imprimirEmOrdemInterno(no.dir);
		}
	}
	
}
