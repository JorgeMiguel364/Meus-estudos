package cnh;

public class CNH{

    public static void main(String[] args)
    {
        Usuário a1 = new Usuário();
        a1.setIdade(16);
        a1.setNome("João Acássio");
        a1.setCnh(12345678);
        
        System.out.println("Idade: " +a1.getIdade());
        System.out.println("Nome: " +a1.getNome());
        System.out.println("CNH: " +a1.getCnh());
    }  
}
