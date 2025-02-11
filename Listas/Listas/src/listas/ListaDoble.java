package listas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LeBron
 */
public class ListaDoble {
    NodoDoble pFirst;
    NodoDoble pLast;
    int size;
    
    public ListaDoble(){
      this.pFirst = null;
      this.pLast = null;
      this.size = 0;
    }
    public void InsertarInicio(Object data){
        NodoDoble newNodoDoble = new NodoDoble(data);
        if (pFirst == null){
            pFirst = pLast = newNodoDoble;
        }else{
            newNodoDoble.setpNext(pFirst);
            pFirst.setpPrevious(newNodoDoble);
            pFirst = newNodoDoble;
        }
        size++;
    }
    
    public void InsertarFinal(Object data){
        NodoDoble newNodoDoble = new NodoDoble(data);
        if (pFirst == null){
            pFirst = pLast = newNodoDoble;
        }else{
            newNodoDoble.setpPrevious(pLast);
            pLast.setpNext(newNodoDoble);
            pLast = newNodoDoble;
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
                if (this.size == 1){
                    this.Vaciar();
                }else{
                pFirst.getpNext().setpPrevious(null);
                pFirst = pFirst.getpNext();}
            }else{
                NodoDoble aux = pFirst;
                while (aux.getpNext() != null && !aux.getpNext().getData().equals(data)){ 
                    aux = aux.getpNext();}
                if (aux.getpNext() != null){
                    if (aux.getpNext().getpNext() == null){
                        aux.getpNext().setpPrevious(null);
                        aux.setpNext(null);   
                    }else{
                    aux.setpNext(aux.getpNext().getpNext());
                    aux.getpNext().getpNext().setpPrevious(aux.getpNext().getpPrevious());
                    aux.getpNext().setpNext(null);
                    aux.getpNext().setpPrevious(null);   
                }
                size--;   
                }
            }
        }
    }
    public void Imprimir(){
        if(!EsVacio()){
            NodoDoble aux = pFirst;
            while (aux != null) {
            System.out.println(aux.getData()+" ");
            aux = aux.getpNext();
            }
        }else{
            System.out.println("La lista esta vacia.");
        }
    }
}
