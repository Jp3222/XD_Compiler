package org.xd.diccionario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jp
 */
public class Estruc extends Diccionario {

    private static Estruc nodo;

    public static Estruc getNodo(String regex[]) {
        if (nodo == null) {
            nodo = new Estruc(regex);
        }
        return nodo;
    }

    private final String[] regex;
    private final Pattern[] p;
    private final Matcher m[];

    private Estruc(String regex[]) {
        this.regex = regex;
        p = new Pattern[regex.length];
        m = new Matcher[regex.length];
        super.init(p, m, regex);
    }

    public boolean isThis(String txt) {
        return super.isThis(p, m, txt);
    }

}
