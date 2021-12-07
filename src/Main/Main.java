package Main;

import IDE.IDE;
import javax.swing.SwingUtilities;

/**
 *
 * @author jp
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new IDE().setVisible(true));
    }
}
