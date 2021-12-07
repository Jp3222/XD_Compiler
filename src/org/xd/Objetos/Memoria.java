package org.xd.Objetos;

import java.util.Objects;
import org.xd.Objetos.Elementos.Objetos;

/**
 *
 * @author jp
 */
public class Memoria extends Objetos implements Comparable<Memoria> {

    /*
    Memoria
    - Caracteristicas
    - - ambito
    - - tipo
    - - pre - fijo
    - Info
    - - id
    - - dato
     */
    private String ambito;
    private String tipo;
    private String pre_fix;

    public Memoria(String pre_fix) {
        this.ambito = "_";
        this.tipo = "objeto";
        this.pre_fix = pre_fix;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPre_fix() {
        return pre_fix;
    }

    public void setPre_fix(String pre_fix) {
        this.pre_fix = pre_fix;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.ambito);
        hash = 67 * hash + Objects.hashCode(this.tipo);
        hash = 67 * hash + Objects.hashCode(this.pre_fix);
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
        final Memoria other = (Memoria) obj;
        if (!Objects.equals(this.ambito, other.ambito)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return super.equals(obj) && Objects.equals(this.pre_fix, other.pre_fix);
    }

    @Override
    public int compareTo(Memoria t) {
        return getId().compareTo(t.getId());
    }

    @Override
    public String toString() {
        return super.toString() + "[" + ambito + "][" + tipo + "][" + pre_fix + "]";
    }

}
