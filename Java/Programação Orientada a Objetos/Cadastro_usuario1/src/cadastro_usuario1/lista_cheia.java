package cadastro_usuario1;

public class lista_cheia extends RuntimeException
{
    public String toString()
    {
        return "\nA lista atingiu seu limite máximo!\n";
    }
}
