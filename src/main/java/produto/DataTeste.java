package produto;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(16, 9, 2004);
        Data d2 = new Data();

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}
