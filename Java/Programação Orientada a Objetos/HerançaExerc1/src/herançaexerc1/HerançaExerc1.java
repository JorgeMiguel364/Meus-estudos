package herançaexerc1;

public class HerançaExerc1{

    public static void main(String[] args)
    {
        Repositor f1 = new Repositor();
        f1.setNome("Marcelo");
        f1.setCpf(691350276);
        f1.setIdade(28);
        f1.setRg("702547812-0");
        f1.imprimirPessoa();
        
        f1.setCorredor("Bebidas");
        f1.imprimirRepositor();
    }
}
