/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.xd.compiler;
import org.xd.Objetos.Memoria;
import org.xd.Memory.Map;

/**
 *
 * @author jp
 */
public class MAP {

    private static MAP Instancia;

    public static MAP getInstancia() {
        if (Instancia == null) {
            Instancia = new MAP();
        }
        return Instancia;
    }

    private Map<String, Memoria> map;
    
    public MAP() {
    }

}
