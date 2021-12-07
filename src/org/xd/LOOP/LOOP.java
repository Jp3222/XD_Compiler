package org.xd.LOOP;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import org.xd.compiler.Set;

/**
 *
 * @author jp
 */
public class LOOP implements Runnable {

    private JTextPane entrada;
    private Set INPUT;

    public LOOP(JTextPane entrada,JLabel l) {
        this.entrada = entrada;
        this.INPUT = Set.getNodo(l);
    }

    @Override
    public void run() {
        try {
            while (true) {
                INPUT.setLines(entrada.getText());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
