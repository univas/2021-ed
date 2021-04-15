package br.edu.univas.si3.ed.list;

public class ProductIterator {
    
    private ProductNode current;

    //construtor: parece um método, que é chamado com o objeto é alocado
    //possui o mesmo nome da classe
    //pode ou não possuir parâmetro
    public ProductIterator(ProductNode firstNode) {
        this.current = firstNode;
    }

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
