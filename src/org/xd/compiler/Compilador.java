package org.xd.compiler;

import javax.swing.JOptionPane;

public class Compilador implements Obj {

    @Override
    public void Input(String[] input) {
        
    }

    @Override
    public boolean Validate() {
        
        return true;
    }

    @Override
    public void Ouput() {
        if (Validate()) {

        } else {
            JOptionPane.showMessageDialog(null,"Error de ejectucion");
        }
    }

}
