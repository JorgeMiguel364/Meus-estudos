package exerc12;

public class Livro
{
    private String titulo;
    private String autor;
    private String corcapa;
    private int qtpaginas;
    private String tema;
    
    public Livro(String tit, String aut, String corc, int qtpag, String tem)
    {
        this.titulo = tit;
        this.autor = aut;
        this.corcapa = corc;
        this.qtpaginas = qtpag;
        this.tema = tem;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    
    public String getAutor()
    {
        return this.autor;
    }
    
    public String getCorcapa()
    {
        return this.corcapa;
    }
    
    public int getQtpaginas()
    {
        return this.qtpaginas;
    }
    
    public String getTema()
    {
        return this.tema;
    }
}
