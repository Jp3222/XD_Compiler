package org.xd.Objetos;

import java.util.Arrays;
import java.util.Objects;
import org.xd.Memory.func;

/**
 *
 * @author jp
 */
public class Variables extends Memoria implements Comparable<Memoria> {

    private String dato;

    public Variables(String line) {
        super("var");
        //
        String info[] = line.split(":=|=");
        setId(info[0]);
        if (line.contains(":=")) {
            dato = info[1];
            setTipo(func.TypeOf(info[1]));
        } else if (line.contains("=")) {
            dato = "null";
            setTipo(info[1]);
        }
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
        hash = 29 * hash + Objects.hashCode(this.dato);
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
        final Variables other = (Variables) obj;

        if (!Objects.equals(this.dato, other.dato)) {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int compareTo(Memoria t) {
        return super.compareTo(t);
    }

    @Override
    public String toString() {
        return super.toString() + "[" + dato + "]]";
    }

}
