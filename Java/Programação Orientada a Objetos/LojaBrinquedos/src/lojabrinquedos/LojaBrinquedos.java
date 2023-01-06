package lojabrinquedos;

public class LojaBrinquedos
{
    public static void main(String[] args)
    {
        Lista lis1 = new Lista(3);
        
        try
        {
            lis1.adicionarBrinquedos(new Brinquedos(3467, "Boneco", 6, 15.99f));
            lis1.acrescentarBrinquedos(3467, 3);
            lis1.adicionarBrinquedos(new Brinquedos(142, "Carro", 3, 9.99f));
            
            //lis1.retirarUnidades(342, 6);
            //lis1.imprimirBrinquedo(3467);
            lis1.relatorioGeral();
            
        }
        catch(IndiceInvalidoException | ListaCheiaException | QuantidadeInsuficienteException exc)
        {
            System.out.println(exc);
        }        
    }    
}
