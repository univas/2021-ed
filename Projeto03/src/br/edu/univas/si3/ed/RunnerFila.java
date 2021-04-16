package br.edu.univas.si3.ed;

import br.edu.univas.si3.ed.data.Queue;
import br.edu.univas.si3.ed.model.Product;

public class RunnerFila {
    public static void main(String[] args) {
        System.out.println("Testando a fila");

        Queue fila = new Queue();
        
        System.out.println(fila.remove());//a fila está vazia
        
        Product p1 = new Product();
        p1.name = "p1";
        p1.amount = 9;
        fila.insert(p1); //p1 entra na fila
        
        System.out.println(fila.remove());//p1 sai na fila

        Product p2 = new Product();
        p2.name = "p2";
        p2.amount = 5;
        fila.insert(p2); //p2 entra na fila

        Product p3 = new Product();
        p3.name = "p3";
        p3.amount = 9;
        fila.insert(p3); //p3 entra na fila

        System.out.println(fila.remove());//p2 sai na fila

        Product p4 = new Product();
        p4.name = "p4";
        p4.amount = 7;
        fila.insert(p4); //p4 entra na fila

        System.out.println(fila.remove());//p3 sai na fila
        System.out.println(fila.remove());//p4 sai na fila
        System.out.println(fila.remove());//a fila está vazia
    }
}
