package produto;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Vinicius";
        u1.email = "vini.dantas61@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Vinicius";
        u2.email = "vini.dantas61@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
