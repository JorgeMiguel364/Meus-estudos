package estacionamento;

public class Estacionamento{

    public static void main(String[] args)
    {
        Carro c1 = new Carro();
        c1.setPlaca("xub784");
        c1.setAnofab(1999);
        c1.setModelo("Honda12");
        c1.setValorcompr(9500);
        
        c1.venderCarro("João Acássio", 10450);
        c1.imprimeDados();
    }
}
