package inst_objeto2;
import java.util.Random;

public class Inst_Objeto2 {

    public static void main(String[] args)
    {
       Random gerador = new Random();
       
        Cliente c1;
        Cliente c2;           
       
       try
       {
            c1 = new Cliente("Jorge", "Masculino", 877, 54896, 26);
            c2 = new Cliente("Renato", "Masculino", 500, 300, 30);  
            
            c1.imprimir();
            c2.imprimir();
       }
       catch (RuntimeException exc)
       {
           System.out.println(exc.getMessage());
       }
              
       /*
       c1.setNome("Jorge");
       c1.setGenero("Masculino");
       c1.setRG(200);
       c1.setCPF(600);
       //c1.setRG(gerador.nextInt(10000));
       //c1.setCPF(gerador.nextInt(10000));
       c1.setIdade(26);
       */
    }    
}
