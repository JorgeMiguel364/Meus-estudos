package exerc9;

public class Carro
{
    private String cor2;
    private String modelo2;
    private int ano2;
    private boolean usado2;
    
    public Carro(String cor, String modelo, int ano, boolean usado)
    {
        cor2 = cor;
        modelo2 = modelo;
        ano2 = ano;
        usado2 = usado;
    }
    
    public void impr()
    {
        System.out.println("Cor: " +cor2);
        System.out.println("Modelo: " +modelo2);
        System.out.println("Ano: " +ano2);
        System.out.print("Usado?: ");
        
        if(usado2)
            System.out.println("Sim");
        else
            System.out.println("Não");
        
        System.out.println();
    }
}
