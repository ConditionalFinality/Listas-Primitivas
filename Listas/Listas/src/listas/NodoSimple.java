package listas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LeBron
 */
public class NodoSimple {
    private Object data;
    private NodoSimple pNext;
    
    public NodoSimple(Object data){
        this.data = data;
        this.pNext = null;
    }

    public NodoSimple(Object data, NodoSimple pNext) {
        this.data = data;
        this.pNext = pNext;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NodoSimple getpNext() {
        return pNext;
    }

    public void setpNext(NodoSimple pNext) {
        this.pNext = pNext;
    }
 
}
