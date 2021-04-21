package br.edu.univas.si3.ed.list;

public class Runner04 {
    public static void main(String[] args) {
        
        ProductList lista1 = new ProductList();

        Product p1 = new Product();
        p1.name = "p1";
        p1.amount = 9;
        lista1.insert(p1);
        
        Product p2 = new Product();
        p2.name = "p2";
        p2.amount = 5;
        lista1.insert(p2);

        Product p3 = new Product();
        p3.name = "p3";
        p3.amount = 9;
        lista1.insert(p3);
        
        Product p4 = new Product();
        p4.name = "p4";
        p4.amount = 7;
        lista1.insert(p4);

        System.out.println("Lista original: " + lista1.getAsString());
        boolean resultado1 = lista1.swap(3, 2);
        System.out.println("Resultado da troca: " + resultado1 + " lista1: " + lista1.getAsString());
        boolean resultado2 = lista1.swap(5, 2);
        System.out.println("Resultado da troca: " + resultado2 + " lista1: " + lista1.getAsString());
    }
}
