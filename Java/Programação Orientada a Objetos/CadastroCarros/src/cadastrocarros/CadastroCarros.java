package cadastrocarros;

public class CadastroCarros {

    public static void main(String[] args)
    {
        ListaCarros l1 = new ListaCarros(5);
        
        try
        {
            
            // Adicionando carros
            l1.cadastrarCarro(new Carros("Ford1", 1999, 25000f, 6389));
            l1.cadastrarCarro(new Carros("Uno1", 2005, 35000f, 1684));
            l1.cadastrarCarro(new Carros("Ford2", 2000, 19000f, 7943));
            l1.cadastrarCarro(new Carros("Ford3", 1996, 21000f, 8327));
            l1.cadastrarCarro(new Carros("Uno2", 2007, 35000f, 5490));            
            //l1.cadastrarCarro(new Carros("Uno3", 2010, 46000f, 1693));
            
            // Testar impressão
            l1.imprimirCarro(8327);
            l1.imprimirCarro(1684);
            
            // Teste de impressão geral
            l1.impressaoGeral();
            
            l1.cadastrarCarro(new Carros("Fusca1", 1960, 10000f, 9127));
            
        }catch(ListaCheia | CodigoInvalido | CodigoDuplicado | ListaZerada exc)
        {
            System.out.print(exc);
        }
    }
}
