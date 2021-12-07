package IDE;

import java.awt.Color;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import org.xd.diccionario.Regexs;

/**
 *
 * @author jp
 */
public class Estilos_PR extends DefaultStyledDocument {

    final StyleContext cont = StyleContext.getDefaultStyleContext();
    //Colores 
    final AttributeSet COLOR_BLUE = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(0, 170, 255));
    final AttributeSet COLOR_RED = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(255, 0, 50));
    final AttributeSet COLOR_GREEN = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(12, 255, 0));
    final AttributeSet COLOR_YELLOW = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(255, 224, 0));
    final AttributeSet COLOR_WHITE = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(255, 255, 255));

    @Override
    public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offset, str, a);
        String text = getText(0, getLength());
        int before = findLastNonWordChar(text, offset);
        if (before < 0) {
            before = 0;
        }
        int after = findFirstNonWordChar(text, offset + str.length());
        int wordL = before;
        int wordR = before;
        while (wordR <= after) {
            if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
                if (text.substring(wordL, wordR).matches("(\\W)*" + Regexs.REGEX_PR_STRUC)) {
                    setCharacterAttributes(wordL, wordR - wordL, COLOR_BLUE, false);
                } else if (text.substring(wordL, wordR).matches("(\\W)*" + Regexs.TDD)) {
                    setCharacterAttributes(wordL, wordR - wordL, COLOR_RED, false);
                } else if (text.substring(wordL, wordR).matches("(\\W)*" + Regexs.TDM)) {
                    setCharacterAttributes(wordL, wordR - wordL, COLOR_RED, false);
                } else if (text.substring(wordL, wordR).matches("(\\W)*" + Regexs.SL)) {
                    setCharacterAttributes(wordL, wordR - wordL, COLOR_RED, false);
                } else if (text.substring(wordL, wordR).matches("(\\W)*" + Regexs.TDD)) {
                    setCharacterAttributes(wordL, wordR - wordL, COLOR_RED, false);
                }else if (text.substring(wordL, wordR).matches("(\\W)*" + Regexs.CADENAS)) {
                    setCharacterAttributes(wordL, wordR - wordL, COLOR_YELLOW, false);
                } else {
                    setCharacterAttributes(wordL, wordR - wordL, COLOR_WHITE, false);
                }
                wordL = wordR;
            }
            wordR++;
        }
    }

    public void romeve(int offs, int len) throws BadLocationException {
        super.remove(offs, len);
        String text = getText(0, getLength());
        int before = findLastNonWordChar(text, offs);
        if (before < 0) {
            before = 0;
        }
    }

    //METODO PARA ENCONTRAR LAS ULTIMAS CADENAS
    private int findLastNonWordChar(String text, int index) {
        while (--index >= 0) {
            //  \\W = [A-Za-Z0-9]
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
        }
        return index;
    }

    //METODO PARA ENCONTRAR LAS PRIMERAS CADENAS 
    private int findFirstNonWordChar(String text, int index) {
        while (index < text.length()) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
            index++;
        }
        return index;
    }

}
