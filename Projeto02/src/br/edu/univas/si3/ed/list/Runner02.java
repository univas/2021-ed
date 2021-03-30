package br.edu.univas.si3.ed.list;

public class Runner02 {
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

        //Navegação nos elementos da lista
        //usaremos uma classe para fazer a iteração (navegar de nó em nó)

        ProductIterator iterador = new ProductIterator();
        iterador.current = list.head;

        //TODO: Exercício: fazer o teste de mesa
        
        while(iterador.hasProduct()) { //enquanto existir nó disponível
            Product produtoAtual = iterador.getCurrent(); //obtém a informação do nó
            System.out.println(produtoAtual);
            iterador.goToNext(); //caminho para o próximo no
        }
    }
}
