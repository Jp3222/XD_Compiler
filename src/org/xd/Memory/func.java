/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.xd.Memory;

import org.xd.diccionario.Regexs;

/**
 *
 * @author jp
 */
public class func {

    public static String TypeOf(Object c) {
        if (c instanceof Integer) {
            return "int";
        }
        if (c instanceof Float || c instanceof Double) {
            return "float";
        }
        if (c instanceof Character) {
            return "char";
        }
        if (c instanceof String) {
            return "string";
        }
        return "null";
    }

    public static String TypeOf(String txt) {
        if (txt.matches(Regexs.BOOL)) {
            return "bool";
        } else if (txt.matches(Regexs.NUMBER)) {
            return "int";
        } else if (txt.matches(Regexs.NUMBER_F)) {
            return "float";
        } else if (txt.matches(Regexs.CADENAS)) {
            return "str";
        }
        return "null";
    }

//    public static String TypeOf(String txt) {
//        return type(txt);
//    }
    private static String type(String txt) {
        try {
            Integer x = Integer.parseInt(txt);
        } catch (NumberFormatException e) {

            return type2(txt);
        }
        return "int";
    }

    private static String type2(String txt) {
        try {
            Double x = Double.parseDouble(txt);
        } catch (NumberFormatException e) {
            return type3(txt);
        }
        return "float";
    }

    private static String type3(String txt) {
        switch (txt) {
            case "True" -> {
                return "bool";
            }
            case "False" -> {
                return "bool";
            }
            case "true" -> {
                return "bool";
            }
            case "false" -> {
                return "bool";
            }
            case "_1" -> {
                return "bool";
            }
            case "_0" -> {
                return "bool";
            }

        }
        return type4(txt);
    }

    private static String type4(String txt) {
        if (txt.isEmpty() || txt.length() > 1) {
            return Type5(txt);
        }
        return "Char";
    }

    private static String Type5(String txt) {
        if (txt.isEmpty()) {
            return "null";
        }
        return "string";
    }

    public static String clear(int type, String line) {
        line = line.trim();
        return switch (type) {
            case 0:
                yield line.replace("var", "").replace(" ", "");
            case 1:
                yield line.replace("const", "").replace(" ", "");
            default:
                yield line;
        };
    }
}
