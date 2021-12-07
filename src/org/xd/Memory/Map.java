package org.xd.Memory;

import java.util.ArrayList;
import java.util.List;
import org.xd.Memory.Nodos.NodoBB;
import org.xd.Memory.Nodos.NodoSimple;

/**
 *
 * @author jp
 * @param <K>
 * @param <T>
 */
public class Map<K extends Comparable<K>, T extends Comparable<T>> {

    private static Map Nodo;
    
    public static Map getNodo() {
        if (Nodo == null) {
            Nodo = new Map();
        }
        return Nodo;
    }

    private NodoBB<K, T> root;
    private int size;

    public Map() {
        this.size = 0;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(K key, T valor) {
        if (isEmpty()) {
            root = new NodoBB(key, valor);
            size++;
            return;
        }
        NodoBB<K, T> nodo = new NodoBB(key, valor);
        add(root, nodo);
    }

    private void add(NodoBB<K, T> root, NodoBB<K, T> nodo) {
        if (root.getKey().compareTo(nodo.getKey()) < 0) {
            if (root.getIzq() == null) {
                root.setIzq(nodo);
                size++;
            } else {
                add(root.getIzq(), nodo);
            }
        } else if (root.getKey().compareTo(nodo.getKey()) > 0) {
            if (root.getDer() == null) {
                root.setDer(nodo);
                size++;
            } else {
                add(root.getDer(), nodo);
            }
        } else {
            root.setObjeto(nodo.getObjeto());
        }
    }

    public int getSize() {
        return size;
    }

    public T[] inOrden(T[] array) {
        List<T> lista = new ArrayList<>();
        inOrden(root, lista);
        return lista.toArray(array);
    }

    private void inOrden(NodoBB<K, T> root, List<T> array) {
        if (root != null) {
            inOrden(root.getIzq(), array);
            array.add(root.getObjeto());
            inOrden(root.getDer(), array);
        }
    }
}
