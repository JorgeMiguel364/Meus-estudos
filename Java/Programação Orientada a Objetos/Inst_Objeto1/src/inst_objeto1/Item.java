package inst_objeto1;

public class Item
{
    private String item_nome;
    private float peso;
    private String tipo;
    
    // ------------- Getters -----------------------------------------------
    public String getItem_nome()
    {
        return this.item_nome;
    }
    
    public float getPeso()
    {
        return this.peso;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    // ------------- Setters -----------------------------------------------
    public void setItem_nome(String in)
    {
        this.item_nome = in;
    }
    
    public void setPeso(float p)
    {
        this.peso = p;
    }
    
    public void setTipo(String t)
    {
        this.tipo = t;
    }
    
    // ------------- Métodos -----------------------------------------------    
    public void imprimirItem()
    {
        System.out.println("Item: " +this.getItem_nome());
        System.out.println("Peso: " +this.getPeso() +" (em gramas)");
        System.out.println("Tipo: " +this.getTipo());
        System.out.println("-----------------------------------------------------------\n");
    }
    
}
