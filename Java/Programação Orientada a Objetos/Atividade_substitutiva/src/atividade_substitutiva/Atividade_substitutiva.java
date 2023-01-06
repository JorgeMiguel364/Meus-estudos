package atividade_substitutiva;

public class Atividade_substitutiva
{
    public static void main(String[] args)
    {
        ListaPedidos l1 = new ListaPedidos(4);
        
        try
        {
            l1.cadastrarPedido(new Pedido(456, 389, 179, 21.09f));
            l1.cadastrarPedido(new Pedido(457, 389, 179, 40f));
            
            l1.cadastrarPedido(new Pedido(789, 508, 547, 5.99f));
            l1.cadastrarPedido(new Pedido(790, 508, 547, 19.99f));
            
            //l1.cadastrarPedido(new Pedido(795, 452, 179, 6.90f));
            
            
            //l1.buscarPedido(789);
            l1.atenderPedido(456);
        }
        catch(PedidoJaExiste | ListaLotada | Verificada exc)
        {
            System.out.print(exc);
        }
    }    
}
