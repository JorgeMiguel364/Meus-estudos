package tecelagem_meucodigo;

public class Produção extends Funcionario
{
    private int horasDiurnas = 0;
    private int horasNoturnas = 0;
    
    public void registrarHorasDiurnas(int horas)
    {
        horasDiurnas += horas;
    }
    
    public void registrarHorasNoturnas(int horas)
    {
        horasNoturnas += horas;
    }
}
