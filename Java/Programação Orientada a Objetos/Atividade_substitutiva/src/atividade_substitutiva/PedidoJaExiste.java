package atividade_substitutiva;

public class PedidoJaExiste extends RuntimeException
{
    public String toString()
    {
        return "Pedido duplicado!\n";
    }
}
