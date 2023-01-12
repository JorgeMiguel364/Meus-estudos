package lojaeletronicos;

public class LojaEletronicos
{
    public static void main(String[] args)
    {
        ListaEletronicos el1 = new ListaEletronicos(5);
        
        try
        {
            el1.adicionarEletronicos(new Eletronicos(582, "Notebook", 15, 1600f));
            el1.retirarEletronicos(582, 9);
            el1.incrementarEletronicos(582, 6);
            el1.imprimirEletronicos(582);
            
            el1.adicionarEletronicos(new Eletronicos(584, "Celular", 20, 1100f));
            
            el1.adicionarEletronicos(new Eletronicos(571, "Tablet", 11, 600f));
            
            el1.adicionarEletronicos(new Eletronicos(583, "Fones de ouvido", 25, 35f));
            
            el1.relatorioGeral();
            
            
        }catch(ListaCheia | IndiceInvalido | IndiceDuplicado exce)
        {
            System.out.print(exce);
        }
    }    
}
