package listas;


import listas.NodoSimple;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LeBron
 */
public class ListaSimple {
    NodoSimple pFirst;
    NodoSimple pLast;
    int size;
    
    public ListaSimple(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public void InsertarInicio(Object data){
        NodoSimple newNodoSimple = new NodoSimple(data);
        if (pFirst == null){
            pFirst = pLast = newNodoSimple;
        }else{
            newNodoSimple.setpNext(pFirst);
            pFirst = newNodoSimple;
        }
        size++;
    }
    
    public void InsertarFinal(Object data){
        NodoSimple newNodoSimple = new NodoSimple(data);
        if (pFirst == null){
            pFirst = pLast = newNodoSimple;
        }else{
            pLast.setpNext(newNodoSimple);
            pLast = newNodoSimple;
        }
        size++;
    }
        
    public boolean EsVacio(){
        return this.pFirst == null;
    }
    
    public void Vaciar(){
        pFirst = null;
        pLast = null;
        size = 0;
    }
    
    public void Eliminar(Object data){
        if (!this.EsVacio()){
            if (this.pFirst.getData().equals(data)){
                if (size == 1){
                    this.Vaciar();
                }else{
                pFirst = pFirst.getpNext();}
            }else{
                NodoSimple aux = pFirst;
                while (aux.getpNext() != null && !aux.getpNext().getData().equals(data)){ 
                    aux = aux.getpNext();}
                if (aux.getpNext() != null){
                    if (aux.getpNext().getpNext() == null){
                        aux.setpNext(null);}
                    else{
                        aux.setpNext(aux.getpNext().getpNext());
                    }
                    size--;   
                }
            }
        }
    }
    
    public void Imprimir(){
        if(!EsVacio()){
            NodoSimple aux = pFirst;
            while (aux != null) {
                System.out.print(aux.getData() + " ");
                aux = aux.getpNext();
            }
            System.out.println(' ');
        }else{
            System.out.println("La lista esta vacia.");
        }
    }
}
