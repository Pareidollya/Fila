/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author jao
 */
public class main {

    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 2;
        int j = 3;
        int k = 4;
        fila f = new fila(5);
        
        f.inserir(x);
        f.inserir(y);
        f.inserir(z);
        f.inserir(j);
        f.inserir(k);
        
        f.print();
        f.remove();
        f.print();
        f.inserir(x);
        f.print();
        
        f.remove();
        f.print();
        
        f.remove();
        f.print();
        
    }
    
}
