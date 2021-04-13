package br.edu.univas.si3.ed.data;

import br.edu.univas.si3.ed.model.Product;

public class Queue {
    
    private ProductNode first = null;
    private ProductNode last = null;

    public void insert(Product product) {
        ProductNode newNode = new ProductNode();
        newNode.info = product;
        if(first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
    }

    public Product remove() {
        if(first == null) {
            return null;
        }
        ProductNode newNode = first;
        first = first.next;
        if(first == null) {
            last = null;
        }

        return newNode.info;
    }
}
