package depositobebidas;

public class DepositoBebidas
{

    public static void main(String[] args)
    {
        ListaBebidas lb1 = new ListaBebidas(5);
        
        try
        {
            lb1.cadastrarBebida(new Bebidas(581, "Vinho Dom Bosco", 11.99f));
            lb1.cadastrarBebida(new Bebidas(582, "Vinho Chapinha", 10.25f));
            lb1.cadastrarBebida(new Bebidas(428, "Vinho São Marcos", 11f));
            lb1.cadastrarBebida(new Bebidas(681, "Pinga 51 LT 350ml", 4.5f));
            lb1.cadastrarBebida(new Bebidas(179, "Água São Lourenço 300ml", 4.15f));
            //lb1.cadastrarBebida(new Bebidas(589, "Vodka Smirnoff 990ml", 16.50f));
            
            
            lb1.buscarBebida(179);
                        
            
        }catch(BebidaDuplicada | ListaLotada | CodigoInexistente | ListaZerada exception)
        {
            System.out.print(exception);
        }
    }    
}
