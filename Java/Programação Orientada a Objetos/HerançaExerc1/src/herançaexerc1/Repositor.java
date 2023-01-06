package herançaexerc1;

public class Repositor extends Pessoa
{
    private String corredor;
    
    public String getCorredor(){
        return corredor;
    }
    
    public void setCorredor(String c){
        corredor = c;
    }
    
    public void imprimirRepositor(){
        System.out.println("Corredor: " +corredor);
    }
}
