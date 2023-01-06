package exerc3;
import java.util.Scanner;

public class Exerc3
{
    public static void main(String[] args){
        int valor;
        
        System.out.print("Informe um valor: ");
        Scanner testsc = new Scanner(System.in);
        valor = testsc.nextInt();
        
        Exerc3a a1 = new Exerc3a(valor);
        
        a1.impr();
    }
    
}
