package org.xd.diccionario;

/**
 *
 * @author jp
 */
public class Regexs {

    //regex tipos de datos
    public static final String TDM = "(var|const)";
    public static final String TDD = "(int|float|char|bool|str|byte)";
    //regex simbolos
    public static final String SL = "(<=|<|>|>=|!=|==)";
    public static final String SLN = "(not)";
    public static final String SLU = "(and|or)";
    public static final String SDAB = "(:=)";
    public static final String SDA = "(=)";
    //Regex Tipos de datos
    public static final String ID = "(\\D[a-zA-Z0-9_]*)";
    public static final String NUMBER = "((|-)([0-9]{1,}))";
    public static final String NUMBER_F = "(" + NUMBER + ".([0-9]{1,}))";
    public static final String CADENAS = "(\"" + "((\\S|\\s)|(\\w|\\s)*)" + "\")";
    public static final String EXP_LOGICA = "((|\\s)(" + ID + "|" + NUMBER + "|" + NUMBER_F + ")(|\\s)" + SL + "(|\\s)(" + ID + "|" + NUMBER + "|" + NUMBER_F + ")(|(\\s(|" + SLU + ")))*)";
    public static final String BOOL = "(true|false)|" + EXP_LOGICA;
    //Palabras reservadas de estructuras
    public static final String REGEX_PR_STRUC = "(if|else|for|while|func)";
    //expresiones regulares de identificacion
    private static final String VAR_NOM = "((|var)(|\\s))";
    //variables
    protected static final String[] Variables = {
        "^" + VAR_NOM + ID + "(|\\s)=(|\\s)" + TDD + "$",
        "^" + VAR_NOM + ID + "((|\\s):=(|\\s))" + BOOL + "$",
        "^" + VAR_NOM + ID + "((|\\s):=(|\\s))" + NUMBER + "$",
        "^" + VAR_NOM + ID + "((|\\s):=(|\\s))" + NUMBER_F + "$",
        "^" + VAR_NOM + ID + "((|\\s):=(|\\s))" + CADENAS + "$"};

    private static final String CONST_NOM = "const\\s";

    //constantes
    protected static final String[] Constantes = {
        "^" + CONST_NOM + ID + "(|\\s):=(|\\s)(|-)" + NUMBER + "$",
        "^" + CONST_NOM + ID + "(|\\s):=(|\\s)(|-)" + NUMBER_F + "$",
        "^" + CONST_NOM + ID + "(|\\s):=(|\\s)(|-)" + BOOL + "$",
        "^" + CONST_NOM + ID + "(|\\s):=(|\\s)(|-)" + CADENAS + "$"
    };
    //Estructuras
    protected static final String[] Estructuras_IF = {
        "^if\\s(" + BOOL + "):$",
        "^else\\s(" + BOOL + "):$",
        "^else:$",};

    protected static final String[] Estructuras_FOR = {
        "^for\\s" + Variables[2] + ";" + BOOL + ";" + ID + "++(|\\s):"
    };

    protected static final String[] Estructura_WHILE = {
        "^while\\s" + BOOL + "(|\\s):"
    };

    //
    private final String[] Ends = {"__", "return", "}"};

}
