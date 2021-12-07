package org.xd.compiler;

import org.xd.diccionario.Const;
import org.xd.diccionario.Estruc;
import org.xd.diccionario.Var;

/**
 *
 * @author jp
 */
public abstract class Objeto {

    private Var var = Var.getNodo();
    private Const cons = Const.getNodo();
  
    //
    private int aperturas, cierres;
    //

    protected String is(String txt) {
        if (var.isThis(txt)) {
            return "var";
        }
        if (cons.isThis(txt)) {
            return "const";
        }
        
        return "unknow";
    }

    public int getAperturas() {
        return aperturas;
    }

    public int getCierres() {
        return cierres;
    }

}
