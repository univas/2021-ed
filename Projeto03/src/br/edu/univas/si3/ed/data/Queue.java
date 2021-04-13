package br.edu.univas.si3.ed.data;

import br.edu.univas.si3.ed.model.Product;

public class Queue { //fila
    
    private ProductNode first = null;
    private ProductNode last = null;

    public void insert(Product product) {
        ProductNode newNode = new ProductNode();
        newNode.info = product;
        if(first == null) { //fila vazia
            first = newNode;
        } else { //a lista não está vazia
            last.next = newNode;
        }
        last = newNode;
    }

    public Product remove() {
        if(first == null) {
            return null;
        }
        ProductNode node = first;
        first = first.next;
        if(first == null) {
            last = null;
        }
        return node.info;
    }
}
