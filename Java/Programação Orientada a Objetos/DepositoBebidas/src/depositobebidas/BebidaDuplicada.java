package depositobebidas;

public class BebidaDuplicada extends RuntimeException
{
    public String toString()
    {
        return "\nBebida já existente na lista!\n";
    }
}
