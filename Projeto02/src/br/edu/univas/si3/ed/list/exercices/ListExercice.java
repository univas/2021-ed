package br.edu.univas.si3.ed.list.exercices;

import br.edu.univas.si3.ed.list.Product;
import br.edu.univas.si3.ed.list.ProductIterator;
import br.edu.univas.si3.ed.list.ProductList;
import br.edu.univas.si3.ed.list.ProductNode;

public class ListExercice {

    // 1 - v2
    public ProductList mergeWith(ProductList list1, ProductList list2) {
        // junta a atual com o other

        ProductList newList = new ProductList();
        ProductIterator it = list1.getIterator();
        while (it.hasProduct()) {
            newList.insert(it.getCurrent());
            it.goToNext();
        }
        it = list2.getIterator();
        while (it.hasProduct()) {
            newList.insert(it.getCurrent());
            it.goToNext();
        }
        return newList;
    }

    // 2 - v2
    //o getNodeAt é privado
    // public boolean swap(ProductList list, int pos1, int pos2) {

    //     ProductNode node1 = list.getNodeAt(pos1);
    //     ProductNode node2 = list.getNodeAt(pos2);

    //     if (node1 == null || node2 == null) {
    //         return false;
    //     }
    //     // troca os produtos
    //     Product temp = node1.info;
    //     node1.info = node2.info;
    //     node2.info = temp;
    //     return true;
    // }

}
