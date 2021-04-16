package br.edu.univas.si3.ed;

import br.edu.univas.si3.ed.data.Stack;
import br.edu.univas.si3.ed.model.Product;

public class RunnerPilha {
    public static void main(String[] args) {
        System.out.println("Testando a pilha");

        Stack pilha = new Stack();
        System.out.println(pilha.pop());//a pilha está vazia

        Product p1 = new Product();
        p1.name = "p1";
        p1.amount = 9;
        pilha.push(p1); //empilha o p1

        Product p2 = new Product();
        p2.name = "p2";
        p2.amount = 5;
        pilha.push(p2); //empilha o p2

        System.out.println(pilha.pop());//desempilha o p2

        Product p3 = new Product();
        p3.name = "p3";
        p3.amount = 9;
        pilha.push(p3); //empilha o p3

        Product p4 = new Product();
        p4.name = "p4";
        p4.amount = 7;
        pilha.push(p4); //empilha o p4

        System.out.println(pilha.pop());//desempilha o p4
        System.out.println(pilha.pop());//desempilha o p3
        System.out.println(pilha.pop());//desempilha o p1
        System.out.println(pilha.pop());//a pilha está vazia
    }
}
