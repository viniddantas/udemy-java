package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Vinicius"));
        usuarios.add(new Usuario("Isabelle"));

        boolean resultado = usuarios.contains(new Usuario("Vinicius"));
        System.out.println(resultado);
    }
}
