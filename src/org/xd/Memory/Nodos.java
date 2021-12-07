package org.xd.Memory;

import java.util.Objects;

/**
 *
 * @author jp
 */
public class Nodos {

    public static class NodoSimple<T extends Comparable<T>> {

        private T obj;
        private NodoSimple<T> sig;

        public NodoSimple(T obj, NodoSimple<T> sig) {
            this.obj = obj;
            this.sig = sig;
        }

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }

        public NodoSimple<T> getSig() {
            return sig;
        }

        public void setSig(NodoSimple<T> sig) {
            this.sig = sig;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 83 * hash + Objects.hashCode(this.obj);
            hash = 83 * hash + Objects.hashCode(this.sig);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final NodoSimple<?> other = (NodoSimple<?>) obj;
            if (!Objects.equals(this.obj, other.obj)) {
                return false;
            }
            return Objects.equals(this.sig, other.sig);
        }

        @Override
        public String toString() {
            return "" + obj;
        }
    }

    public static class NodoDoble<T extends Comparable<T>> {

        private T obj;
        private NodoDoble<T> sig, ant;

        public NodoDoble(T obj, NodoDoble<T> sig, NodoDoble<T> ant) {
            this.obj = obj;
            this.sig = sig;
            this.ant = ant;
        }

        public NodoDoble(T obj) {
            this.obj = obj;
        }

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }

        public NodoDoble<T> getSig() {
            return sig;
        }

        public void setSig(NodoDoble<T> sig) {
            this.sig = sig;
        }

        public NodoDoble<T> getAnt() {
            return ant;
        }

        public void setAnt(NodoDoble<T> ant) {
            this.ant = ant;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 73 * hash + Objects.hashCode(this.obj);
            hash = 73 * hash + Objects.hashCode(this.sig);
            hash = 73 * hash + Objects.hashCode(this.ant);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final NodoDoble<?> other = (NodoDoble<?>) obj;
            if (!Objects.equals(this.obj, other.obj)) {
                return false;
            }
            if (!Objects.equals(this.sig, other.sig)) {
                return false;
            }
            if (!Objects.equals(this.ant, other.ant)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "" + obj;
        }
    }

    public static class NodoBB<K extends Comparable<K>, T extends Comparable<T>> {

        private NodoBB<K, T> izq, der;
        private K key;
        private T objeto;

        public NodoBB(K key, T objeto) {
            this.izq = null;
            this.der = null;
            this.key = key;
            this.objeto = objeto;
        }

        public NodoBB<K, T> getIzq() {
            return izq;
        }

        public void setIzq(NodoBB<K, T> izq) {
            this.izq = izq;
        }

        public NodoBB<K, T> getDer() {
            return der;
        }

        public void setDer(NodoBB<K, T> der) {
            this.der = der;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public T getObjeto() {
            return objeto;
        }

        public void setObjeto(T objeto) {
            this.objeto = objeto;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 47 * hash + Objects.hashCode(this.izq);
            hash = 47 * hash + Objects.hashCode(this.der);
            hash = 47 * hash + Objects.hashCode(this.key);
            hash = 47 * hash + Objects.hashCode(this.objeto);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final NodoBB<?, ?> other = (NodoBB<?, ?>) obj;
            if (!Objects.equals(this.izq, other.izq)) {
                return false;
            }
            if (!Objects.equals(this.der, other.der)) {
                return false;
            }
            if (!Objects.equals(this.key, other.key)) {
                return false;
            }
            return Objects.equals(this.objeto, other.objeto);
        }

        @Override
        public String toString() {
            return "key: " + key;
        }

    }

}
