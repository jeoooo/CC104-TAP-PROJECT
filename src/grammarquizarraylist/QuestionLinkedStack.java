/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammarquizarraylist;

import singlylinkedlist.*;

/**
 *
 * @author Jeo
 */
public class QuestionLinkedStack<E> implements Stack<E>{

   private final SList list;

    public QuestionLinkedStack(){
        list = new SList<>();
    }
    
    /**
     *
     * @param node
     * @return
     */
    public E push(E node) {
        list.addFirst((SNode)node);
        return node;
    }

    
    public E pop() {
        E e = (E)list.first();
        list.removeFirst();
        return e;
    }

    
    public E top() {
        return (E) list.first();
    }

    
    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void showStack(){
        list.showList();
    }

}
