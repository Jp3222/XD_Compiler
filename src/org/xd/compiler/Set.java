package org.xd.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;

public class Set {

    private static Set Nodo;

    public static Set getNodo(JLabel l) {
        if (Nodo == null) {
            Nodo = new Set(l);
        }
        return Nodo;
    }

    private ArrayList<String> lines;
    private Evaluador evt;

    private Set(JLabel l) {
        lines = new ArrayList<>(0);
        evt = new Evaluador();
        evt.label = l;
    }

    public void setLines(String arg) {
        clear();
        String cl[] = arg.split("\n");
        for (String str : cl) {
            if (!str.isEmpty()) {
                lines.add(str);
            }
        }
        cl = new String[lines.size()];
        cl = lines.toArray(cl);
        System.out.println(Arrays.toString(cl));
        evt.Input(cl);
    }

    protected ArrayList<String> getLines() {
        return lines;
    }

    public void clear() {
        while (!lines.isEmpty()) {
            lines.remove(0);
        }
    }

}
