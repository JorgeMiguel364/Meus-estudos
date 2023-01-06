package inst_objeto1;

public class Inst_Objeto1 {

    public static void main(String[] args)
    {
        Item i1 = new Item();
        Item i2 = new Item();
        
        i1.setItem_nome("Celular");
        i1.setPeso(100);
        i1.setTipo("Eletrônico");
        i1.imprimirItem();
        
        i2.setItem_nome("Foto");
        i2.setPeso(2);
        i2.setTipo("Papel impresso");
        i2.imprimirItem();

    }
    
}
