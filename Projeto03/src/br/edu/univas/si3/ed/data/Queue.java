package br.edu.univas.si3.ed.data;

import br.edu.univas.si3.ed.model.Product;

public class Queue { //fila
    
    private ProductNode first = null;
    private ProductNode last = null;
    private int size = 0;

    public void insert(Product product) {
        ProductNode newNode = new ProductNode();
        newNode.info = product;
        if(first == null) { //fila vazia
            first = newNode;
        } else { //a lista não está vazia
            last.next = newNode;
        }
        last = newNode;
        size++;
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
        size--;
        return node.info;
    }

    public int length() {
        int count = 0;

        //contar os elementos
        ProductNode current = first;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public int size() { //getSize
        return size;
    }
}
