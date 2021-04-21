package br.edu.univas.si3.ed.list;

public class Runner05 {
    public static void main(String[] args) {
        
        ProductList lista1 = new ProductList();
        System.out.println("Lista original: " + lista1.getAsString());

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
        ProductList lista2 = lista1.subList(1,2);
        System.out.println("lista2: " + lista2.getAsString());

        ProductList lista3 = lista1.subList(2,10);
        System.out.println("lista3: " + lista3.getAsString());

        ProductList lista4 = lista1.subList(3,1); //os parâmetros estão inconsistentes
        System.out.println("lista4: " + lista4.getAsString());

        int idx = -2; //simulando um cálculo
        ProductList lista5 = lista1.subList(idx, idx + 3); //os parâmetros estão inconsistentes
        System.out.println("lista5: " + lista5.getAsString());
    }
}
