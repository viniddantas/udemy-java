package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Robson");
        lista.add(u1);
        lista.add(new Usuario("Vinicius"));
        lista.add(new Usuario("Rodrigo"));
        lista.add(new Usuario("Anna"));
        lista.add(new Usuario("Isabelle"));

        for (Usuario u: lista) {
            System.out.println(u.nome);
        }


    }
}
