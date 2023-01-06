package exerc13;

public class Exerc13a implements Exerc13Interface
{
    private int valor;
    
    public Exerc13a()
    {
        valor = 0;
    }
    
    public void setValor(int v)
    {
        valor = v;
    }
    
    public int getValor()
    {
        return valor;
    }

    @Override
    public void adicionar()
    {
        setValor(getValor() + 1);
        System.out.print(getValor() + ", ");
    }
}
