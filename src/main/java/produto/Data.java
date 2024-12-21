package produto;

public class Data {
    byte dia;
    byte mes;
    int ano;

    Data() {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano) {
        this.dia = (byte)dia;
        this.mes = (byte)mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return dia + "/" + mes + "/" + ano;
    }
}
