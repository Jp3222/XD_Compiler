package org.xd.Memory;

import org.xd.Memory.Nodos.NodoDoble;

/**
 *
 * @author jp
 * @param <T>
 */
public class Cola<T extends Comparable<T>> {

    private NodoDoble<T> inicio, fin;
    private int size;

    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void Empty() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    public void enqueue(T obj) {
        if (!isEmpty()) {
            fin = new NodoDoble(obj, null, fin);
            fin.getAnt().setSig(fin);
        } else {
            inicio = new NodoDoble<>(obj, null, null);
            fin = inicio;
        }
        size++;
    }

    public T dequeue() {
        T aux = inicio.getObj();
        if (inicio == fin) {
            inicio = null;
            fin = null;
            size--;
        } else {
            inicio = inicio.getSig();
            inicio.setAnt(null);
            size--;
        }
        return aux;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String cola = "[ ";
        NodoDoble<T> aux = inicio;
        while (aux != null) {
            cola += aux.getObj() + ", ";
            aux = aux.getSig();
        }
        return "" + cola.substring(0, cola.length() - 1) + " ]";
    }

}
