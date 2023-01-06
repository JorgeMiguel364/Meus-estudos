package loja;

public class Produtos
{
    private String nome = "";
    private int RG;
    private double preco;
    private int qtprodutos = 0;
    
    // setters
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setRG(int RG)
    {
        this.RG = RG;
    }
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    public void setQtprodutos(int qtprodutos)
    {
        this.qtprodutos = qtprodutos;
    }
    
    // getters
    public double getTotal()
    {
        return preco * qtprodutos;
    }
    
    public double getDescont()
    {
        return getTotal() * .05;
    }
    
    public void saida()
    {
        System.out.println("Nome: " +nome);
        System.out.println("RG: " +RG);
        System.out.println("Preço unitário: " +preco);
        System.out.println("Quantidade de produtos: " +qtprodutos);
        System.out.printf("Preço total: %.2f\n\n", getTotal());
        
        if(qtprodutos >= 15)
        {
            System.out.printf("Descontado: %.2f\n", getDescont());
            System.out.printf("Preço total com desconto: %.2f\n\n", getTotal()-getDescont());            
        }
    }
}
