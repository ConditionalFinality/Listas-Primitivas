package listas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LeBron
 */
public class ListaCircular {
    NodoSimple pHead;
    int size;
    
    public ListaCircular(){
        this.pHead = null;
        size = 0;
    }
    
    public void Insertar(Object data){
        NodoSimple newNodoSimple = new NodoSimple(data);
        if (pHead == null){
            pHead = newNodoSimple;
            newNodoSimple.setpNext(newNodoSimple);
        }else{
            newNodoSimple.setpNext(pHead.getpNext());
            pHead.setpNext(newNodoSimple);
        }
        size++;         
    }
        
    public boolean EsVacio(){
        return this.pHead == null;
    }
    
    public void Vaciar(){
        pHead = null;
        size = 0;
    }
    
    public void Eliminar(Object data){
        if (!this.EsVacio()){
            NodoSimple aux = pHead;
            if (size == 1){
                if (pHead.getData().equals(data)){
                    this.Vaciar();
                }
            }else{
                for (int i = 0; i < size; i++) {
                    aux = aux.getpNext(); 
                    if (aux.getpNext().getData().equals(data)) {
                        if (aux.getpNext() == pHead) {
                            pHead = pHead.getpNext();
                        }
                        aux.setpNext(aux.getpNext().getpNext());
                        size--;
                }
            }
        }
    }
}
    
    public void Imprimir(){
        if(!EsVacio()){
            NodoSimple aux = pHead;
            for (int i = 0; i < size; i++) {
            System.out.println(aux.getData()+" ");
            aux = aux.getpNext();
            }
        }else{
            System.out.println("La lista esta vacia.");
        }
    }
}
