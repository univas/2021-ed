package br.edu.univas.si3.ed.list;

public class Runner01 {
    public static void main(String[] args) {
        System.out.println("Início do teste da lista.");
        ProductList carrinho = new ProductList(); //#1)criar uma lista

        //simula o cadastro do produto p1
        Product p1 = new Product();
        p1.name = "p1";
        p1.amount = 9;
        //vamos inserir na lista o produto criado
        carrinho.insert(p1); //#2)inserir um elemento na lista

        Product p2 = new Product();
        p2.name = "p2";
        p2.amount = 5;
        carrinho.insert(p2);

        Product p3 = new Product();
        p3.name = "p3";
        p3.amount = 9;
        carrinho.insert(p3);

        Product p4 = new Product();
        p4.name = "p4";
        p4.amount = 7;
        carrinho.insert(p4);

        //carrinho.head = null; //não pode, porque o head é privado

        System.out.println("Produtos do carrinho: " + carrinho.getAsString());//#3)obtém uma String com o conteúdo da lista

        System.out.println("Produto encontrado 0: " + carrinho.findByName("p0"));//#4)procura um elemento pelo nome
        Product prodFound = carrinho.findByName("p1");
        System.out.println("Produto encontrado 1: " + prodFound);
        System.out.println("Produto encontrado 2: " + carrinho.findByName("p2"));
        System.out.println("Produto encontrado 4: " + carrinho.findByName("p4"));
        System.out.println("Produto encontrado 5: " + carrinho.findByName("qualquer um"));

        System.out.println("Produto na posição -1: " + carrinho.getElementAt(-1)); //null
        System.out.println("Produto na posição 3: " + carrinho.getElementAt(3)); //produto 4 //#5) procura um elemento pela posição
        System.out.println("Produto na posição 7: " + carrinho.getElementAt(7)); //null

        carrinho.remove("p2"); //caso 4 //#6)remove um elemento da lista
        System.out.println("Produtos da lista após remover o p2: " + carrinho.getAsString());

        carrinho.remove("pY"); //caso 5 - o produto não existe
        System.out.println("Produtos da lista após remover o pY: " + carrinho.getAsString());

        carrinho.remove("p1");//caso 2
        System.out.println("Produtos da lista após remover o p1: " + carrinho.getAsString());

        carrinho.remove("p4");//caso 3
        System.out.println("Produtos da lista após remover o p4: " + carrinho.getAsString());

        carrinho.remove("p3");//caso 6
        System.out.println("Produtos da lista após remover o p3: " + carrinho.getAsString());

        carrinho.remove("pX");//caso 1 - lista vazia
        System.out.println("Produtos da lista após remover o pX: " + carrinho.getAsString());

        System.out.println("Fim do teste da lista.");
    }
}
