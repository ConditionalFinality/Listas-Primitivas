package listas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LeBron
 */
public class NodoDoble {
    private Object data;
    private NodoDoble pNext;
    private NodoDoble pPrevious;
    
    public NodoDoble(Object data){
        this.data = data;
        this.pNext = null;
        this.pPrevious = null;
    }

    public NodoDoble(Object data, NodoDoble pNext, NodoDoble pPrevious) {
        this.data = data;
        this.pNext = pNext;
        this.pPrevious = pPrevious;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NodoDoble getpNext() {
        return pNext;
    }

    public void setpNext(NodoDoble pNext) {
        this.pNext = pNext;
    }

    public NodoDoble getpPrevious() {
        return pPrevious;
    }

    public void setpPrevious(NodoDoble pPrevious) {
        this.pPrevious = pPrevious;
    }
}
