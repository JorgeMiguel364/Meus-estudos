package exerc12;

public class Exerc12 {

    public static void main(String[] args)
    {
        Livro l1 = new Livro("Nossas aventuras", "José Alves", "Azul", 60, "Aventura");
        
        System.out.println("Autor: " +l1.getAutor());
        System.out.println("Cor da capa: " +l1.getCorcapa());
        System.out.println("Título: " +l1.getTitulo());
        System.out.println("Tema: " +l1.getTema());
        System.out.println("Quantidade de páginas: " +l1.getQtpaginas());
        
    }
}
