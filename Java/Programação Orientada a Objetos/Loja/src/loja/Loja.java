package loja;

public class Loja {

    public static void main(String[] args)
    {
        Produtos p1 = new Produtos();
        p1.setNome("Jorge Lima");
        p1.setRG(435755647);
        p1.setPreco(32.59);
        p1.setQtprodutos(19);
        p1.saida();
    }
}
