package br.edu.univas.si3.ed.list;

public class ProductList {

    public ProductNode head;
    public ProductNode last;

    public void insert(Product prod) {
        //1 - alocar um node novo
        ProductNode novoNode = new ProductNode();

        //2 - faz o head apontar para o node novo
        if(head == null) { //lista vazia
            head = novoNode;
        } else { //a lista não está vazia
            last.next = novoNode; //último
        }

        //salvando o último
        last = novoNode;

        //3 - faz o info do node apontar para o produto
        novoNode.info = prod;
    }

    //public ProductNode procurarUltimo() .....
    //salvaremos o último quando um nó for inserido

    //TODO: Exercício: criar um método para cada função abaixo:
    //1 - imprimir a lista (as informações de todos os elementos da lista)
    //2 - buscar um produto utilizando o nome do produto (retornar o produto encontrado ou null)
    //3 - (extra) excluir um produto da lista
}
