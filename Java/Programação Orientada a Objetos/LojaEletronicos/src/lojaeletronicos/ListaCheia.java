package lojaeletronicos;

public class ListaCheia extends RuntimeException
{
    public String toString()
    {
        return "\nA lista atingiu seu limite máximo!\n";
    }
}
