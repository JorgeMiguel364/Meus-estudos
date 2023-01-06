package depositobebidas;

public class DepositoBebidas
{

    public static void main(String[] args)
    {
        ListaBebidas lb1 = new ListaBebidas(5);
        
        try
        {
            lb1.cadastrarBebida(new Bebidas(581, "Vinho Dom Bosco", 11.99f));
            
        }catch(BebidaDuplicada | ListaLotada | CodigoInexistente exception)
        {
            System.out.print(exception);
        }
    }    
}
