package br.edu.univas.si3.ed.arvore;

import br.edu.univas.si3.ed.arvore.model.ArvoreBinariaV1;
import br.edu.univas.si3.ed.arvore.model.No;

public class Runner01 {
    public static void main(String[] args) {
        ArvoreBinariaV1 arvore = new ArvoreBinariaV1();
    
        No noD = arvore.criarNo('d');
        No noE = arvore.criarNo('e');
        No noF = arvore.criarNo('f');
        
        No noB = arvore.criarSubArvore('b', null, noD);
        No noC = arvore.criarSubArvore('c', noE, noF);
        arvore.criarRaiz('a', noB, noC);
        
        arvore.imprimirPreOrdem();
    }
}
