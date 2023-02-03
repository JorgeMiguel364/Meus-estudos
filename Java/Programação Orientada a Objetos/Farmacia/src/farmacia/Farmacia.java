package farmacia;

public class Farmacia
{

    public static void main(String[] args)
    {
        Lista l1 = new Lista(5);
        
        try
        {
            // adicionarMedic
            l1.adicionarMedic(new Medicamento("Sertralina 50mg", 25.99f, 7350, 35));
            l1.adicionarMedic(new Medicamento("Toraxin 25mg", 45.85f, 6279, 15));
            l1.adicionarMedic(new Medicamento("Flaximino 60mg", 27.50f, 7491, 41));
            l1.adicionarMedic(new Medicamento("Fluoxetina 30mg", 15.99f, 7128, 78));
            
            // imprimir geral
            l1.imprimirGeral();
            
            // imprimir medicamento
            l1.imprimirMedicamento(7491);
            
            // retirar unidades
            l1.retirarUnidades(7350, 12);
            l1.retirarUnidades(7128, 32);
            l1.retirarUnidades(6279, 20);
            
            // acrescentar medicamentos
            l1.acrescentarUnidades(7491, 12);
            l1.acrescentarUnidades(7128, 5);
            l1.acrescentarUnidades(7350, 25);
            
            // imprimir geral
            l1.imprimirGeral();
            
            // ---
            l1.retirarUnidades(7128, 5);
            l1.imprimirMedicamento(7128);
            l1.acrescentarUnidades(7128, 15);
            l1.imprimirMedicamento(7128);
            
            l1.adicionarMedic(new Medicamento("Tuazelom 45mg", 29.80f, 5720, 36));
            l1.imprimirMedicamento(5720);
            
            // Exception
            //l1.adicionarMedic(new Medicamento("Tuazerina 15mg", 12.70f, 6279, 25));
            //l1.imprimirMedicamento(9417);
            
        }catch(ListaCheia | CodigoInexistente | CodigoDuplicado | ListaZerada excp)
        {
            System.out.print(excp);
        }
    }
}
