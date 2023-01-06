package exerc11;

public class Exerc11{

    public static void main(String[] args)
    {
        Moto m1 = new Moto();
        m1.setAno(2003);
        m1.setCor("Vermelha");
        m1.setModelo("Jaburu");
        
        System.out.println("Ano: " +m1.getAno());
        System.out.println("Cor: " +m1.getCor());
        System.out.println("Modelo: " +m1.getModelo());
    }
    
}
