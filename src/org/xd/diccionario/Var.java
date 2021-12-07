package org.xd.diccionario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xd.Memory.Map;
import org.xd.Objetos.Variables;

/**
 *
 * @author jp
 */
public class Var extends Diccionario {

    private static Var nodo;

    public static Var getNodo() {
        if (nodo == null) {
            nodo = new Var();
        }
        return nodo;
    }

    private final String[] regex;
    private final Pattern[] p;
    private final Matcher m[];

    private Var() {
        this.regex = Regexs.Variables;
        
        p = new Pattern[regex.length];
        m = new Matcher[regex.length];
        super.init(p, m, regex);
    }

    public boolean isThis(String txt) {
        return super.isThis(p, m, txt);
    }

}
