package br.com.fatec.controller;
import br.com.fatec.model.Usuario;
import java.util.ArrayList;
public class Persistencia {
    public static ArrayList<Usuario> lista = new ArrayList<>();
    
    public static boolean cadastrar(Usuario user){
if(user != null){
lista.add(user);
return true;
}else{
return false;
} } 
}
