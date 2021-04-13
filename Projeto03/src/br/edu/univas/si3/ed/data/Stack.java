package br.edu.univas.si3.ed.data;

import br.edu.univas.si3.ed.model.Product;

public class Stack { //pilha
    
    private ProductNode top = null;

    public void push(Product product) {
        ProductNode newNode = new ProductNode();
        newNode.info = product;
        newNode.next = top;
        top = newNode;
    }

    public Product pop() {
        if(top == null) {
            return null;
        }
        ProductNode node = top;
        top = top.next;
        return node.info;
    }
}
