package exceção_exerc1;

public class exerc1a
{
    private double valor_a_pagar;
    private double preco;
    
    public exerc1a()
    {
        valor_a_pagar = 10;
        preco = 50;
    }
    
    public void pagar() throws Exception
    {
        System.out.println("Preço: " +preco);
        System.out.println("Valor a pagar: " +valor_a_pagar);
        
        if(valor_a_pagar <= preco)
        {
            System.out.println("\n-- Valor pago com sucesso --");
            System.out.println("Você ficou com: " +(preco - valor_a_pagar));
        }else throw new Exception();
        
        
    }
    
    public void setValor_a_pagar(double valor_a_pagar)
    {
        this.valor_a_pagar = valor_a_pagar;
    }
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    public double getPreco()
    {
        return this.preco;
    }
}
