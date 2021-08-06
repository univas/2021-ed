package br.edu.univas.si3.ed.arvore.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArvoreBinariaV1 {

	private NoOfChar raiz;
	
	public void criarRaiz(Character caracter, NoOfChar esq, NoOfChar dir) {
		raiz = criarSubArvore(caracter, esq, dir);
	}
	
	public NoOfChar criarNo(Character caracter) {
		NoOfChar no = new NoOfChar();
		no.info = caracter;
		return no;
	}

	public NoOfChar criarSubArvore(Character caracterRaiz, NoOfChar esquerda, NoOfChar direita) {
		NoOfChar pai = criarNo(caracterRaiz);
		pai.esq = esquerda;
		pai.dir = direita;
		return pai;
	}
	
	public void imprimirPreOrdem() {
		imprimirPreOrdemInterno(raiz);
	}

	private void imprimirPreOrdemInterno(NoOfChar no) { //processa antes de ir para a esquerda (recursivo)
		if (no != null) {
			System.out.print(no.info + "-"); //processa a raiz (da sub-árvore)
			imprimirPreOrdemInterno(no.esq);
			imprimirPreOrdemInterno(no.dir);
		}
	}
	
	public void imprimirEmOrdem() {
		imprimirEmOrdemInterno(raiz);
	}
	
	private void imprimirEmOrdemInterno(NoOfChar no) { //processa depois que volta da esquerda
		if (no != null) {
			imprimirEmOrdemInterno(no.esq);
			System.out.print(no.info + "-"); //processa a raiz (da sub-árvore)
			imprimirEmOrdemInterno(no.dir);
		}
	}
	
	public void imprimirPosOrdem() {
		imprimirPosrdemInterno(raiz);
	}
	
	private void imprimirPosrdemInterno(NoOfChar no) { //processa depois que volta da direita
		if (no != null) {
			//System.out.println("Processando nó: " + no.info);
			imprimirPosrdemInterno(no.esq);
			imprimirPosrdemInterno(no.dir);
			System.out.print(no.info + "-"); //processa a raiz (da sub-árvore)
		}
	}
	
	//exercício 6-b
	public int quantidadeNos() {
		return calcularQuantidadeNos(raiz);
	}

	private int calcularQuantidadeNos(NoOfChar no) {
		if(no == null) {
			return 0;
		}
		int qtdEsquerda = calcularQuantidadeNos(no.esq);
		int qtdDireita = calcularQuantidadeNos(no.dir);
		return 1 + qtdEsquerda + qtdDireita;
		
		//return 1 + calcularQuantidadeNos(no.esq) + calcularQuantidadeNos(no.dir);
	}

	//exercício 6-a
	public int altura() {
		return calcularMaiorNivel(raiz, 0);
	}
	
	private int calcularMaiorNivel(NoOfChar no, int nivel) {
		if(no == null) {
			return nivel - 1;
		}
		int nivelEsquerda = calcularMaiorNivel(no.esq, nivel + 1);
		int nivelDireita = calcularMaiorNivel(no.dir, nivel + 1);
		return Math.max(nivelEsquerda, nivelDireita);
	}
		
	//exercício 7
	public Character buscarElemento(Character buscado) { //sem recurssividade

		//Esta implementação é conhecida como "Busca em Largura".
		//TODO: fazer o teste de mesa
		
		List<NoOfChar> aguardando = new ArrayList<>();
		aguardando.add(raiz);
		
		while(!aguardando.isEmpty()) {
			NoOfChar current = aguardando.remove(0); //pega o 1o elemento da lista
			if(current.info.equals(buscado)) {
				return current.info; //achou o objeto buscado
			}
			if(current.esq != null) {
				aguardando.add(current.esq);
			}
			if(current.dir != null) {
				aguardando.add(current.dir);
			}
		}
		return null; //não achou
	}	

	public Character buscarElementoProfundidade(Character buscado) { //sem recurssividade

		//Esta implementação é conhecida como "Busca em Profundidade".
		
		Queue<NoOfChar> aguardando = new LinkedList<>();
		aguardando.add(raiz);
		
		while(!aguardando.isEmpty()) {
			NoOfChar current = aguardando.poll(); //pega o 1o elemento da pilha
			if(current.info.equals(buscado)) {
				return current.info; //achou o objeto buscado
			}
			if(current.esq != null) {
				aguardando.add(current.esq);
			}
			if(current.dir != null) {
				aguardando.add(current.dir);
			}
		}
		return null; //não achou
	}	
}
