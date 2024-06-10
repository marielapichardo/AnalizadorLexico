/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoPrincipal;

import java.io.File;

/**
 *
 * @author USER
 */
public class analizador {
    public static void main(String[] args){
        String ubicacion = "C:/Users/USER/OneDrive/Documentos/NetBeansProjects/analizadorLexico/src/codigoPrincipal/Lexer.flex";
        generadorLexer(ubicacion);
    }
    public static void generadorLexer(String ubicacion){
        File archivo = new File(ubicacion);
        JFlex.Main.generate(archivo);
    }
}
