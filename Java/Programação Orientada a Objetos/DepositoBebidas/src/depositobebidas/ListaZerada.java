package depositobebidas;

public class ListaZerada extends RuntimeException
{
    public String toString()
    {
        return "\nNão há itens cadastrados na lista!\n";
    }
}
