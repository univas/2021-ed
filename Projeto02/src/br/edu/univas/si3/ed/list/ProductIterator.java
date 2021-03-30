package br.edu.univas.si3.ed.list;

public class ProductIterator {
    
    public ProductNode current;

    public boolean hasProduct() {
        return current != null;
    }

    public void goToNext() {
        if(current != null) {
            current = current.next;
        }
    }

    public Product getCurrent() {
        return current.info;
    }
}
