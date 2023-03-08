package cadastrocarros;

public class ListaCarros
{
    Carros listaCar[];
    int contador, i;
    
    public ListaCarros(int qtMax)
    {
        listaCar = new Carros[qtMax];
        contador = 0;
    }
    
    void cadastrarCarro(Carros car)
    {
        if(contador >= listaCar.length)
        {
            throw new ListaCheia();
        }
        
        for(i=0; i<contador; i++)
        {
            if(listaCar[i].getCodigo() == car.getCodigo())
            {
                throw new CodigoDuplicado();
            }
        }
        
        listaCar[contador] = car;
        System.out.println("Carro adicionado com sucesso!");
        contador++;
    }
    
    void imprimirCarro(int codigo)
    {
        if(contador == 0)
        {
            throw new ListaZerada();
        }
        
        System.out.println("\n- Impressão -\n");                
                
        for(i=0; i<contador; i++)
        {            
            if(listaCar[i].getCodigo() == codigo)
            {
                System.out.println("Modelo: " +listaCar[i].getModelo());
                System.out.println("Ano: " +listaCar[i].getAno());
                System.out.println("Preço: " +listaCar[i].getPreco());
                System.out.println("Código: " +listaCar[i].getCodigo());
                System.out.println("\n");
                return;
            }
        }
        
        throw new CodigoInvalido();
    }
    
    void impressaoGeral()
    {
        if(contador == 0)
        {
            throw new ListaZerada();
        }
        
        System.out.println("\n- Impressão geral -\n");        
        
        for(i=0; i<contador; i++)
        {
            System.out.println("Modelo: " +listaCar[i].getModelo());
            System.out.println("Ano: " +listaCar[i].getAno());
            System.out.println("Preço: " +listaCar[i].getPreco());
            System.out.println("Código: " +listaCar[i].getCodigo());
            System.out.println("\n");
        }
    }
}
