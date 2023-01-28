package cadastroitens;

public class CadastroItens
{

    public static void main(String[] args)
    {
        ListaItens li1 = new ListaItens(4);
        
        try
        {
            li1.cadastrarItem(new Itens(573, "Brinquedo"));
            li1.cadastrarItem(new Itens(714, "Boneca"));
            li1.cadastrarItem(new Itens(792, "Ferramenta"));
            li1.cadastrarItem(new Itens(714, "Bola"));
        }catch(CodigoDuplicado | ListaCheia exception)
        {
            System.out.print(exception);
        }
    }
}
