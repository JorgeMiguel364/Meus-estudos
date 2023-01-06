package herançaexerc1;

public class Pessoa
{
    private String nome, RG;
    private int CPF, idade;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String getRg(){
        return RG;
    }
    
    public void setRg(String rg){
        this.RG = rg;
    }
    
    public int getCpf(){
        return CPF;
    }
    
    public void setCpf(int cpf){
        this.CPF = cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int i){
        idade = i;
    }
    
    public void imprimirPessoa(){
        System.out.println("Nome: " +nome);
        System.out.println("RG: " +RG);
        System.out.println("CPF: " +CPF);
        System.out.println("Idade: " +idade);
                
    }
    
}
