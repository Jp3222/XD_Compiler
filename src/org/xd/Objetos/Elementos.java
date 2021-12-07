package org.xd.Objetos;

import java.util.Objects;

/**
 *
 * @author jp
 */
public abstract class Elementos {

    protected static class Objetos {

        public String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "[[" + id + "]";
        }

    }

    //Estructura
    //Tipo
    //
    protected static class Estructura {

        private String tipo;
        private String[] codigo;

        
    }

}
