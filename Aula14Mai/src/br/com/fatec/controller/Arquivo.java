
package br.com.fatec.controller;

import br.com.fatec.model.Usuario;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Arquivo {
    public static final String FILE_PATH = "C:\\Users\\FATEC ZONA LESTE\\Desktop";
    public static Object gravar(ArrayList<Usuario> lista, String textinho) throws IOException{
        FileWriter arq = new FileWriter(gravar); //cria objeto do tipo arquivo
        PrintWriter gravarArq = new PrintWriter(arq); //habilita arquivo para ser gravado
//percorre a lista e grava no arquivo   
        return null;
    }
}
