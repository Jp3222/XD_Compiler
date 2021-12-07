package org.xd.diccionario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jp
 */
abstract class Diccionario {

    protected void init(Pattern[] p, Matcher[] m, String[] regex) {
        for (int i = 0; i < regex.length; i++) {
            p[i] = Pattern.compile(regex[i]);
        }
    }

    protected boolean isThis(Pattern p[], Matcher m[], String txt) {
        for (int i = 0; i < p.length; i++) {
            m[i] = p[i].matcher(txt);
            if (m[i].matches()) {
                return true;
            }

        }
        return false;
    }
}
