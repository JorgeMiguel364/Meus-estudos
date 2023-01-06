package escola;

public class Funcionários
{
    private String nome;
    private int RG;
    private double sal_hora;
    private int qt_horas;
    
    public void setNome(String n)
    {
        nome = n;
    }
    
    public void setRg(int rg)
    {
        this.RG = rg;
    }
    
    public void setSal_hora(double sh)
    {
        sal_hora = sh;
    }
    
    public void setQt_horas(int qth)
    {
        qt_horas = qth;
    }
    
    public void imprimir()
    {
        System.out.println("\n- Funcionários -");
        System.out.println("Nome: " +nome);
        System.out.println("RG: " +RG);
        System.out.println("Salário hora: " +sal_hora);
        System.out.println("Quantidade horas por mês: " +qt_horas+ "\n");
    }
}
