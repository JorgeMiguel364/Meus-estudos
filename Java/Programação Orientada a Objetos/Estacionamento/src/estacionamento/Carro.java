package estacionamento;

public class Carro
{
    private String placa;
    private int anofab;
    private String modelo;
    private double valorcompr;
    private boolean disp = true;
    private String vendedor = "";
    private double valvenda = 0;
    
    // setters
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }
    
    public void setAnofab(int anofab)
    {
        this.anofab = anofab;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public void setValorcompr(double valorcompr)
    {
        this.valorcompr = valorcompr;
    }
    
    public boolean disponivel()
    {
        return disp;
    }
    
    public boolean oferta(double valor)
    {
        return valor >= valorcompr * 1.1;
    }
    
    public boolean venderCarro(String vendedor, double valorVenda)
    {
        if(!disp) return false;
        if(!oferta(valorVenda)) return false;
        
        this.vendedor = vendedor;
        this.valvenda = valorVenda;
        disp=false;
        return true;
    }
    
    public double comissao()
    {
        if(disp) return 0;
        
        return (valvenda - valorcompr) * 0.1;
    }
    
    public void imprimeDados()
    {
        System.out.println("Placa: " +placa);
        System.out.println("Ano de fabricação: " +anofab);
        System.out.println("Modelo: " +modelo);
        System.out.println("Valor de compra: " +valorcompr);
        System.out.print("Vendido?: ");
        
        if(disp)
        {
            System.out.println("Não");
        }
        else
        {
            System.out.println("Sim");
            System.out.println("Nome do vendedor: " +vendedor);
            System.out.println("Comissão do vendedor: " +comissao());
        }
    }
}
