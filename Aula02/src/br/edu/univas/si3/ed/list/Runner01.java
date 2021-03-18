package br.edu.univas.si3.ed.list;

public class Runner01 {
    public static void main(String[] args) {
        System.out.println("Início do teste da lista.");
        ProductList list = new ProductList();

        Product p1 = new Product();
        p1.name = "p1";
        p1.amount = 9;

        list.insert(p1);

        Product p2 = new Product();
        p2.name = "p2";
        p2.amount = 5;

        list.insert(p2);

        Product p3 = new Product();
        p3.name = "p3";
        p3.amount = 9;

        list.insert(p3);

        System.out.println("Fim do teste da lista.");
    }
}
