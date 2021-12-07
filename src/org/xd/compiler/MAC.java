package org.xd.compiler;

public class MAC {

    private static MAC Instancia;

    public static MAC getInstancia() {
        if (Instancia==null) {
            Instancia = new MAC();
        }
        return Instancia;
    }
    
    
    
}
