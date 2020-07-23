/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammarquizarraylist;

/**
 *
 * @author Jeo
 */
public interface Stack<E>{

        public E push(E node);

        public E pop();

        public E top();

        public int size();

        public boolean isEmpty();

    }
