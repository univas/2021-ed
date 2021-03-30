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

        Product p4 = new Product();
        p4.name = "p4";
        p4.amount = 7;
        list.insert(p4);

        System.out.println("Produtos da lista: " + list.getAsString());

        System.out.println("Produto encontrado 0: " + list.findByName("p0"));
        Product prodFound = list.findByName("p1");
        System.out.println("Produto encontrado 1: " + prodFound);
        System.out.println("Produto encontrado 2: " + list.findByName("p2"));
        System.out.println("Produto encontrado 4: " + list.findByName("p4"));
        System.out.println("Produto encontrado 5: " + list.findByName("qualquer um"));

        System.out.println("Produto na posição -1: " + list.getElementAt(-1)); //null
        System.out.println("Produto na posição 3: " + list.getElementAt(3)); //produto 4
        System.out.println("Produto na posição 7: " + list.getElementAt(7)); //null

        list.remove("p2"); //caso 4
        System.out.println("Produtos da lista após remover o p2: " + list.getAsString());

        list.remove("pY"); //caso 5 - o produto não existe
        System.out.println("Produtos da lista após remover o pY: " + list.getAsString());

        list.remove("p1");//caso 2
        System.out.println("Produtos da lista após remover o p1: " + list.getAsString());

        list.remove("p4");//caso 3
        System.out.println("Produtos da lista após remover o p4: " + list.getAsString());

        list.remove("p3");//caso 6
        System.out.println("Produtos da lista após remover o p3: " + list.getAsString());

        list.remove("pX");//caso 1 - lista vazia
        System.out.println("Produtos da lista após remover o pX: " + list.getAsString());

        System.out.println("Fim do teste da lista.");
    }
}
