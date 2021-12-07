package org.xd.diccionario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jp
 */
public class Const extends Diccionario{

    private static Const Nodo;

    public static Const getNodo() {
        if (Nodo == null) {
            Nodo = new Const();
        }
        return Nodo;
    }

    private final String[] regex;
    private final Pattern[] p;
    private final Matcher m[];

    private Const() {
        this.regex = Regexs.Constantes;

        p = new Pattern[regex.length];
        m = new Matcher[regex.length];
        super.init(p, m, regex);
    }

    public boolean isThis(String txt) {
        return super.isThis(p, m, txt);
    }

}
