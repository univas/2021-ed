package br.edu.univas.si3.ed.data;

import br.edu.univas.si3.ed.model.Product;

public class Stack {
    
    private ProductNode top = null;

    public void push(Product product) {
        ProductNode newNode = new ProductNode();
        newNode.info = product;
        if(top != null) {
            top.next = newNode;
        }
        top = newNode;
    }

    public Product pop() {
        if(top == null) {
            return null;
        }
        ProductNode newNode = top;
        top = top.next;

        return newNode.info;
    }
}
