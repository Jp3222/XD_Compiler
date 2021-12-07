package org.xd.diccionario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jp
 */
public class IF extends Diccionario {

    private Estruc get = Estruc.getNodo(Regexs.Estructuras_IF);

    protected boolean isThis(String txt) {
        return get.isThis(txt); 
    }

}
