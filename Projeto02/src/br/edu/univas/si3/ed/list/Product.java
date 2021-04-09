package br.edu.univas.si3.ed.list;

public class Product {

    // informações do nó
    public String name;
    public int amount;

    //retorna uma String correspondente a um objeto. Usado para debug.
    public String toString() {
        return "Product: " + name + " (" + amount + ")";
    }
}
