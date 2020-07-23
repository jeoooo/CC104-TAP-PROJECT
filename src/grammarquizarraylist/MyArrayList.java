/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammarquizarraylist;

import doublylinkedlist.DList;
import doublylinkedlist.DNode;

/**
 *
 * @author Jeo
 */
public class MyArrayList<E> implements MyList<E>{

    private DList<E> list;

    public MyArrayList() {
        list = new DList<>();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E get(int i) throws InvalidIndexException {
        return null;
    }

    @Override
    public E set(int i, E e) throws InvalidIndexException {
        return null;
    }

    @Override
    public void add(int i, E e) throws InvalidIndexException {

        DNode<E> temp = list.getHeader();

        for (int j = 0; j <= size(); j++) {
            if (i == j) {
                list.addBetween(temp, (DNode) e, temp.getNext());
                break;
            }
            temp = temp.getNext();
        }

        if (i >= size()) {
            throw new InvalidIndexException("Invalid index.");
        }
    }

    @Override
    public E remove(int i) throws InvalidIndexException {
        return null;
    }

    public void showList() {
        list.showList();
    }
}
