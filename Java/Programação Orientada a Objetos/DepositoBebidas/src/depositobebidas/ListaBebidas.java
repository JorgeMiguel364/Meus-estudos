package depositobebidas;

import java.text.DecimalFormat;

public class ListaBebidas
{
    Bebidas listBebidas[];
    int i, contador;
    boolean itemInexistente;
    
    DecimalFormat dec = new DecimalFormat("0.00");
    
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
    
    void codigoDuplicado(int beb)
    {
        for(i=0; i<contador; i++)
        {
            if(listBebidas[i].getCodigoBebidas() == beb)
            {
                throw new BebidaDuplicada();
            }
        }
    }
    
    void codigoInexistente(int cod)
    {
        boolean codigoInexistente = true;
        
        for(i=0; i<contador; i++)
        {
            if(listBebidas[i].getCodigoBebidas() == cod)
            {
                codigoInexistente = false;
            }
        }
        
        if(codigoInexistente)
        {
            throw new CodigoInexistente();
        }
    }
    
    void buscarBebida(int codigoB)
    {
        semItens();
        codigoInexistente(codigoB);
        
        for(i=0; i<contador; i++)
        {
            if(listBebidas[i].getCodigoBebidas() == codigoB)
            {
                System.out.println("\nCódigo: " +listBebidas[i].getCodigoBebidas());
                System.out.println("Descrição: " +listBebidas[i].getDescricao());
                System.out.println("Preço: " +dec.format(listBebidas[i].getPreco()));
            }
        }
    }
    
    void cadastrarBebida(Bebidas beb)
    {
        codigoDuplicado(beb.getCodigoBebidas());
                
        if(listBebidas.length <= contador)
        {
            throw new ListaLotada();
        }
        else
        {
            listBebidas[contador] = beb;
            System.out.println(beb.getCodigoBebidas()+ " - Bebida cadastrada com sucesso!");
            contador++;
        }

    }
    
    void atualizarPrecoDescricao(int codBeb, String novaDescricao, double novoPreco)
    {
        semItens();
        codigoInexistente(codBeb);
        
        for(i=0; i<contador; i++)
        {
            if(listBebidas[i].getCodigoBebidas() == codBeb)
            {
                listBebidas[i].setDescricao(novaDescricao);
                listBebidas[i].setPreco(novoPreco);
                System.out.println("\n" +codBeb+ " - Bebida atualizado com sucesso!");
            }
        }
    }
}
