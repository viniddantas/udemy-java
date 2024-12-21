package produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4385.89);
        Produto p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 2.56;
        Produto.desconto = 0.29;



    }
}
