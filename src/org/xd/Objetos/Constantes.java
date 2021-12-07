package org.xd.Objetos;

import java.util.Objects;
import org.xd.Memory.func;

public class Constantes extends Memoria {

    private String dato;

    public Constantes(String line) {
        super("const");
        String[] value = line.split(":=");
        setId(value[0]);
        setDato(func.TypeOf(value[1]));
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.dato);
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
        final Constantes other = (Constantes) obj;
        return super.equals(obj) && Objects.equals(this.dato, other.dato);
    }

    @Override
    public String toString() {
        return "[" + dato + "]";
    }

}
