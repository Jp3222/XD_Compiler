package org.xd.compiler;

import org.xd.Objetos.Constantes;
import org.xd.Objetos.Estructuras;
import org.xd.Objetos.Memoria;
import org.xd.Objetos.Variables;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.xd.Memory.Cola;
import org.xd.Memory.Map;
import org.xd.Memory.func;

public class Evaluador extends Objeto implements Obj {

    private final Cola<Memoria> memoria;
    private Cola<Memoria> memoriaInt;
    private Cola<Memoria> memoriaDef;
    private Cola<Memoria> estructuras;
    JLabel label;
    private Map<String, Memoria> map;

    int i;

    public Evaluador() {
        memoria = new Cola<>();
        memoriaInt = new Cola<>();
        memoriaDef = new Cola<>();
        estructuras = new Cola<>();
        map = Map.getNodo();
    }

    @Override
    public void Input(String[] input) {
        i = 0;
        for (String string : input) {
            switch (is(string)) {
                case "var" -> {
                    Variables x = new Variables(func.clear(0, string));
                    memoria.enqueue(x);
                }
                case "const" -> {
                    Constantes x = new Constantes(func.clear(1, string));
                    memoria.enqueue(x);
                }
                case "if" -> {
                }
                case "else" -> {
                }
                case "for" -> {
                }
                case "while" -> {
                }
                default -> {
                    i++;
                    System.out.println("unknow");
                }
            }
        }
        Ouput();
    }

    //int := "HOla xdd"
    @Override
    public boolean Validate() {
        for (int j = 0; j < memoria.getSize(); j++) {
            Memoria aux = memoria.dequeue();
            map.add(aux.getId(), aux);
        }
        System.out.println(Arrays.toString(map.inOrden(new Memoria[map.getSize()])));
        return this.i == 0;
    }

    @Override
    public void Ouput() {
        if (Validate()) {
            if (label != null) {
                label.setText("Correcto");
            }
        } else {
            if (label != null) {
                label.setText("Error");
            }
        }
    }

}
