package br.edu.univas.si3.ed.list;

public class Runner03 {
    public static void main(String[] args) {
        
        ProductList lista1 = new ProductList();
        ProductList lista2 = new ProductList();

        Product p1 = new Product();
        p1.name = "p1";
        p1.amount = 9;
        lista1.insert(p1);

        Product p3 = new Product();
        p3.name = "p3";
        p3.amount = 9;
        lista1.insert(p3);
        
        Product p2 = new Product();
        p2.name = "p2";
        p2.amount = 5;
        lista2.insert(p2);

        Product p4 = new Product();
        p4.name = "p4";
        p4.amount = 7;
        lista2.insert(p4);

        ProductList lista3 = lista1.mergeWith(lista2);
        System.out.println("Lista3: " + lista3.getAsString());

        ProductList lista4 = lista2.mergeWith(lista1);
        System.out.println("Lista4: " + lista4.getAsString());
        
    }
}
