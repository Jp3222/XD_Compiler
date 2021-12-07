package org.xd.Memory;

import org.xd.Memory.Nodos.NodoSimple;

public class Pila<T extends Comparable<T>> {

    private NodoSimple<T> cima;
    private int size;

    public Pila() {
        cima = null;
        size = 0;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public void push(T dato) {
        cima = new NodoSimple<>(dato, cima);
        size++;
    }
    
    public void pushAll(T... c){
        for (T t : c) {
            push(t);
        }
    }

    public T pop() {
        T aux = cima.getObj();
        cima = cima.getSig();
        size--;
        return aux;
    }

    public T peek() {
        return cima.getObj();
    }

    @Override
    public String toString() {
        NodoSimple<T> star = cima;
        String aux = "pila {\n";
        while (star != null) {
            aux = aux.concat(star.getObj() + "\n");
            star = star.getSig();
        }
        return aux.substring(0, aux.length() - 1) + "}";
    }

}
