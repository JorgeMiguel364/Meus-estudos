package depositobebidas;

public class ListaBebidas
{
    Bebidas listBebidas[];
    int i, contador;
    boolean itemInexistente;
    
    public ListaBebidas(int qtMaxima)
    {
        listBebidas = new Bebidas[qtMaxima];
        i = 0;
        contador = 0;
        itemInexistente = true;
    }
    
    void semItens()
    {
        if(contador == 0)
        {
            throw new ListaZerada();
        }
    }
    
    void buscarBebida(int codigoB)
    {
        semItens();
        
        for(i=0; i<contador; i++)
        {
            if(listBebidas[i].getCodigoBebidas() == codigoB)
            {
                System.out.println("\nCódigo: " +listBebidas[i].getCodigoBebidas());
                System.out.println("Descrição: " +listBebidas[i].getDescricao());
                System.out.println("Preço: " +listBebidas[i].getPreco());
                itemInexistente = false;
            }
        }
        
        if(itemInexistente)
        {
            System.out.println("Código " +codigoB+ " inexistente!");
        }
    }
    
    void cadastrarBebida(Bebidas beb)
    {
        if(buscarBebida(beb.getCodigoBebidas()) == null)
        {
            if(contador >= listBebidas.length)
            {
                throw new ListaLotada();
            }
            else
            {
                listBebidas[contador] = beb;
                System.out.println(listBebidas[contador].getCodigoBebidas() +"cadastrado com sucesso!");
                
                contador++;
            }
        }
        else
        {
            throw new BebidaDuplicada();
        }
    }
    
    void atualizarPrecoDescricao(int codBeb, double novoPreco, String novaDescricao)
    {
        if(buscarBebida(codBeb) != null)
        {
            throw new CodigoInexistente();
        }
        else
        {
            for(i=0 ;i<listBebidas.length; i++)
            {
                if(listBebidas[i].getCodigoBebidas() == codBeb)
                {
                    listBebidas[i].setDescricao(novaDescricao);
                    listBebidas[i].setPreco(novoPreco);
                }
            }
            
            System.out.println(listBebidas[i].getCodigoBebidas() +"atualizado com sucesso!");
        }
    }
}
