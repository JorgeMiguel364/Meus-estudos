package depositobebidas;

public class ListaLotada extends RuntimeException
{
    public String toString()
    {
        return "\nA lista atingiu seu limite máximo!\n";
    }
}
