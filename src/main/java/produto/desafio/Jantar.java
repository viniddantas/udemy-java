package produto.desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vinicius", 60);
        Comida c1 = new Comida("Lasanha", 0.223);
        Comida c2 = new Comida("Arroz", 0.1);

        System.out.println(p1.peso);

        p1.comer(c1);

        System.out.println(p1.peso);

        p1.comer(c2);

        System.out.println(p1.peso);
    }
}
