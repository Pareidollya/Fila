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
public class fila<T> {
    private int tamanho;
    private T[] fila;
    private int elementos = 0;
    
    public fila(int tamanho){
        this.tamanho = tamanho;
        this.fila = (T[]) new Object[tamanho];
    }
    
    public void inserir(T elemento){
        this.verificarTamanho();
        Iterador it = new Iterador(this.fila);
        int count = 0;
        
        while (it.hasNext()){
            if(it.next() == null){
                this.fila[count] = elemento;
                this.elementos ++;
                System.out.println("elemento adicionado na fila\n");
                break;                
            }
            count++;
        }
    }
    
    public boolean existeDadao(int pos){
        if(this.fila[pos] != null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isEmpty(){
        if(this.elementos == 0){
            return true;
        }
        else 
            return false;
    }
    public T recuperar(){
        if (this.isEmpty() == true){
            System.out.println("A fila está vazia!");
            return fila[0];
        }
        else{
            return fila[0];
        }
    }
    
    public void remove(){
        Iterador it = new Iterador(this.fila); 
        this.elementos--;
        int count = 0;
       
        while(it.hasNext()){ //avançar a fila
            if(it.next() != this.fila[tamanho - 1]){
                this.fila[count] = this.fila[count+1];
                this.fila[count+1] = null;
            }
            count++;
        } 
        System.out.println("elemento removido");
    }
    
    public int tamanho(){
        return this.elementos;
    }
    
    public void Limpa(){
        if (this.isEmpty()== true){
            System.out.println("A fila ja esta vazia");
        }
        else{
        Iterador it = new Iterador(this.fila); 
        int count = 0;
        
        while (it.hasNext()){
            if(it.next() != null){
                this.fila[count] = null;
                elementos--;
              }
            count++;
            }
        }
        System.out.println("fila limpo");
    }
    
    public void print(){
        for(int i =0; i<this.tamanho;i++){
            System.out.print(this.fila[i] +" ");
        }
        System.out.print("\n");
    }
    public void verificarTamanho(){
        if (this.elementos + 1 > this.tamanho){
            throw new IllegalArgumentException("A fila está CHEIA!");
        }
    }
         public void verificarPosição(int pos){ 
         if (pos>=tamanho){
            throw new IllegalArgumentException("Posição invalida!");
        }
       else if (pos < 0){
           throw new IllegalArgumentException("Posição invalida!");
       }
     }
    

    
}
