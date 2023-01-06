package escola;

public class Professores
{
    private String nome;
    private int RG;
    private double sal_hr;
    private int qt_hr;
    private String area;
    
    public Professores()
    {
        
    }
    
    public Professores(String n, int r, double s, int q, String a)
    {
        nome = n;
        RG = r;
        sal_hr = s;
        qt_hr = q;
        area = a;
    }
    
    public void imprimir()
    {
        System.out.println("\n- Professores -");
        System.out.println("Nome: " +nome);
        System.out.println("RG: " +RG);
        System.out.println("Salário hora: " +sal_hr);
        System.out.println("Quantidade horas por mês: " +qt_hr);
        System.out.println("Área de atuação: " +area+ "\n");
    }
}
