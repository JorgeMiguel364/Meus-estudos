package exerc4;
import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args){
        int val1, val2;
        Scanner SC = new Scanner(System.in);
        Exerc4a ex;
        
        System.out.print("Informe o primeiro vaor: ");
        val1 = SC.nextInt();
        
        System.out.print("Informe o segundo valor: ");
        val2 = SC.nextInt();
        
        ex = new Exerc4a(val1, val2);
        
        System.out.println("A média é: " +ex.getMedia());
        
    }
    
}
