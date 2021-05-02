/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.util.Iterator;

/**
 *
 * @author jao
 */
public class Iterador<T> implements Iterator {

    T[] itens;
    int posicao = 0;
    int posiçãoF;
    
    public Iterador(T[] itens) {
        this.itens = itens;
        int posiçãoF = itens.length -1;
    }

    public boolean hasNext() {
        if (posicao < 0 || posicao >= itens.length) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        Object item = itens[posicao];
        posicao++;
        return item;
    }
    public Object nextNext(){
        Object item = itens[posicao+1];
        return item;
    }
}
    