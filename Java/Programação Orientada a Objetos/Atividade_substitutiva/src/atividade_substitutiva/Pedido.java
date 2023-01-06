package atividade_substitutiva;

public class Pedido
{
    private int numeroPedido;
    private int codigoCliente;
    private int codigoVendedor;
    private double valor;
    private boolean foiAtendido;
    private boolean foiPago;
    
    public Pedido(int numeroPedido, int codigoCliente, int codigoVendedor, double valor)
    {
        this.numeroPedido = numeroPedido;
        this.codigoCliente = codigoCliente;
        this.codigoVendedor = codigoVendedor;
        this.valor = valor;
        this.foiAtendido = false;
        this.foiPago = false;
    }
    
    // -------------- Setters --------------
    public void setNumeroPedido(int numeroPedido)
    {
        this.numeroPedido = numeroPedido;
    }
    
    public void setCodigoCliente(int codigoCliente)
    {
        this.codigoCliente = codigoCliente;
    }
    
    public void setCodigoVendedor(int codigoVendedor)
    {
        this.codigoVendedor = codigoVendedor;
    }
    
    public void setValor(double valor)
    {
        this.valor = valor;
    }
    
    public void setFoiAtendido(boolean foiAtendido)
    {
        this.foiAtendido = foiAtendido;
    }
    
    public void setFoiPago(boolean foiPago)
    {
        this.foiPago = foiPago;
    }
    
    // -------------- Getters --------------
    public int getNumeroPedido()
    {
        return numeroPedido;
    }
    
    public int getCodigoCliente()
    {
        return codigoCliente;
    }
    
    public int getCodigoVendedor()
    {
        return codigoVendedor;
    }
    
    public double getValor()
    {
        return valor;
    }
    
    public boolean getFoiAtendido()
    {
        return foiAtendido;
    }
    
    public boolean getFoiPago()
    {
        return foiPago;
    }
}
