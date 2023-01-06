package exerc.tecelagem;

public class Administração
{
    private String nome;
    private int RG;
    private double sal_base;
    private int faltas;
    
    public Administração(String nome, int RG, double sal_base)
    {
        this.nome = nome;
        this.RG = RG;
        this.sal_base = sal_base;
        this.faltas = 0;
    }
    
    public double salarioLiquido()
    {
        return ((.03 * faltas) * sal_base) - sal_base;
    }
    
    public void hollerith()
    {
        System.out.println("Nome: " +nome);
        System.out.println("RG: " +RG);
        System.out.println("Salário base: " +sal_base);
        
        if(faltas > 0)
        {
            System.out.println("Desconto por faltas: 3%");
            System.out.println("Quantidade de faltas: " +faltas);
            System.out.println("Total descontado: " +(.03 * faltas) * sal_base);
        }
        
        System.out.println("Salário líquido: " +salarioLiquido());
        
    }
    
    public void novoMes()
    {
        faltas = 0;
    }
    
    public void registrarFalta()
    {
        this.faltas++;
    }
}
