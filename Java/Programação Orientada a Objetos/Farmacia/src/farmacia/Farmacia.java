package farmacia;

public class Farmacia
{

    public static void main(String[] args)
    {
        Lista l1 = new Lista(5);
        
        try
        {
            l1.adicionarMedic(new Medicamento("Sertralina 50mg", 25.99f, 7350, 35));
            l1.adicionarMedic(new Medicamento("Toraxin 25mg", 45.85f, 6279, 15));
            l1.adicionarMedic(new Medicamento("Flaximino 60mg", 27.50f, 7491, 41));
            l1.adicionarMedic(new Medicamento("Fluoxetina 30mg", 15.99f, 7128, 78));
            
            l1.imprimirGeral();
            
            l1.acrescentarUnidades(7350, 10);
            l1.retirarUnidades(6, 6279);
            l1.acrescentarUnidades(7402, 20);
            
        }catch(ListaCheia | CodigoInexistente | CodigoDuplicado | ListaZerada excp)
        {
            System.out.print(excp);
        }
    }
}
