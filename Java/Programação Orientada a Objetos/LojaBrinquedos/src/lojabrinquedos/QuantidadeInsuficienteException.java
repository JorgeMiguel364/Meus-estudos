package lojabrinquedos;

public class QuantidadeInsuficienteException extends RuntimeException
{
 
    public String toString()
    {
        return "\nQuantidade insuficiente no estoque\n";
    }
}
