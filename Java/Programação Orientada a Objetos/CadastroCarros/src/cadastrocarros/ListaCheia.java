package cadastrocarros;

public class ListaCheia extends RuntimeException
{
    public String toString()
    {
        return "\nA lista atingiu sua capacidade máxima!\n";
    }
}
